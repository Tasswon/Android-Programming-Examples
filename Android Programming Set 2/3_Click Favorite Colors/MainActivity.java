package ca.algomau.clickfavouritecolours;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private int count1 = 0;
    private int count2 = 0;
    private int count3 = 0;
    private int count4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);


        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count1++;
                tv1.setText("Red: " + count1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count2++;
                tv2.setText("Blue: " + count2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count3++;
                tv3.setText("Green: " + count3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count4++;
                tv4.setText("Purple: " + count4);
            }
        });
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("c1", count1);
        outState.putInt("c2", count2);
        outState.putInt("c3", count3);
        outState.putInt("c4", count4);
    }

    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState); // always call superclass method
        count1 = inState.getInt("c1");
        count2 = inState.getInt("c2");
        count3 = inState.getInt("c3");
        count4 = inState.getInt("c4");
        tv1.setText("Red: " + count1);
        tv2.setText("Blue: " + count2);
        tv3.setText("Green: " + count3);
        tv4.setText("Purple: " + count4);
    }
}
