package ca.algomau.pokemon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import static android.R.attr.defaultValue;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        int src = intent.getIntExtra("key", defaultValue);
        ImageView image = (ImageView) findViewById(R.id.image);
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);

        String [] array1 = getResources().getStringArray(R.array.pokemon_name);
        String [] array2 = getResources().getStringArray(R.array.pokemon_desciption);

        switch(src) {
            case R.drawable.pikachu:
                image.setImageResource(R.drawable.pikachu);
                tv1.setText(array1[0]);
                tv2.setText(array2[0]);
                break;
            case R.drawable.mew:
                image.setImageResource(R.drawable.mew);
                tv1.setText(array1[1]);
                tv2.setText(array2[1]);
                break;
            case R.drawable.charmander:
                image.setImageResource(R.drawable.charmander);
                tv1.setText(array1[2]);
                tv2.setText(array2[2]);
                break;
            case R.drawable.bulbasaur:
                image.setImageResource(R.drawable.bulbasaur);
                tv1.setText(array1[3]);
                tv2.setText(array2[3]);
                break;
            case R.drawable.squirtle:
                image.setImageResource(R.drawable.squirtle);
                tv1.setText(array1[4]);
                tv2.setText(array2[4]);
                break;
            case R.drawable.meowth:
                image.setImageResource(R.drawable.meowth);
                tv1.setText(array1[5]);
                tv2.setText(array2[5]);
                break;
        }
    }
}
