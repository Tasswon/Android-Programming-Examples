package ca.algomau.gradecalculator;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText assignment;
    private EditText exam;
    private TextView answer;
    private Button calculate;
    private Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        assignment = (EditText) findViewById(R.id.assignment);
        exam = (EditText) findViewById(R.id.exam);
        answer = (TextView) findViewById(R.id.answer);
        calculate = (Button) findViewById(R.id.calculateBtn);
        clear = (Button) findViewById(R.id.clearBtn);

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(assignment.getText().toString());
                int num2 = Integer.parseInt(exam.getText().toString());

                int finalVal = (num1 / 2) + (num2 / 2);
                answer.setText("Your final grade is: " + Integer.toString(finalVal));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                assignment.setText(null);
                exam.setText(null);
                answer.setText("Final Grade");
            }
        });
    }
}
