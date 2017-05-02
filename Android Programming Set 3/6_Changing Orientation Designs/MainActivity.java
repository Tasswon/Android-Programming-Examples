package ca.algomau.pokemon;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View view) {

        int src = 0;

        switch(view.getId()) {
            case R.id.btnPikachu: src = R.drawable.pikachu;
                break;
            case R.id.btnMew: src = R.drawable.mew;
                break;
            case R.id.btnCharmander: src = R.drawable.charmander;
                break;
            case R.id.btnBulbasaur: src = R.drawable.bulbasaur;
                break;
            case R.id.btnSquirtle: src = R.drawable.squirtle;
                break;
            case R.id.btnMeowth: src = R.drawable.meowth;
                break;
        }

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            BlankFragment fragment = (BlankFragment) getSupportFragmentManager().findFragmentById(R.id.frag);
            fragment.imageChoice(src);
        }
        else {
            newActivity(src);
        }
    }

    public void newActivity(int src) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("key", src);
        startActivity(intent);
    }
}
