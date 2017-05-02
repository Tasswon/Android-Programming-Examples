package ca.algomau.showthemark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String val1 = intent.getStringExtra(MainActivity.VAL1);
        String val2 = intent.getStringExtra(MainActivity.VAL2);
        TextView tv1 = new TextView(this);

        tv1.setTextSize(25);
        tv1.setGravity(Gravity.CENTER);
        tv1.setText("Hello " + val1 + ", \n\n" + "Your midterm exam mark is " + val2 + ".");

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_main2);
        layout.addView(tv1);
    }
}
