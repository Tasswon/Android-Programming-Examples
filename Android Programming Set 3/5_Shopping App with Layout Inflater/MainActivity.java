package ca.algomau.shopapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private static final int[] imageArray = {R.drawable.c,  R.drawable.haskell,  R.drawable.java,  R.drawable.python};
    private static final String [] prices = {"48.20", "22.50", "70.55", "50.02"};
    private static final int [] ids = {R.id.ed1, R.id.ed2, R.id.ed3, R.id.ed4};
    private TextView tv;
    private EditText ed;
    private double sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = (LinearLayout) findViewById(R.id.main_activity);

        View inflatedView;
        for (int i = 0; i < imageArray.length; i++) {
            inflatedView = getLayoutInflater().inflate(R.layout.inflate, null);

            ImageView iv = (ImageView) inflatedView.findViewById(R.id.icon);
            TextView priceView = (TextView) inflatedView.findViewById(R.id.priceView);
            EditText ed = (EditText) inflatedView.findViewById(R.id.ed);

            ed.setId(ids[i]);
            priceView.setText("Price: $" + prices[i]);
            iv.setImageResource(imageArray[i]);
            layout.addView(inflatedView);
        }

        Button btn = new Button(this);
        btn.setText("Checkout");
        layout.addView(btn);

        tv = new TextView(this);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(20);
        layout.addView(tv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum = 0;
                for(int i = 0; i < 4; i++) {
                    ed = (EditText) findViewById(ids[i]);

                    int count;
                    double temp;
                    switch(i) {
                        case 0:
                            count = Integer.parseInt(ed.getText().toString());
                            temp = 48.20 * count;
                            sum += temp;
                            break;
                        case 1:
                            count = Integer.parseInt(ed.getText().toString());
                            temp = 22.50 * count;
                            sum += temp;
                            break;
                        case 2:
                            count = Integer.parseInt(ed.getText().toString());
                            temp = 70.55 * count;
                            sum += temp;
                            break;
                        case 3:
                            count = Integer.parseInt(ed.getText().toString());
                            temp = 50.02 * count;
                            sum += temp;
                            break;
                    }
                }
                tv.setText("Total is $" + Double.toString(sum));
            }
        });
    }
}


