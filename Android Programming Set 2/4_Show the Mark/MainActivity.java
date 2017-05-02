package ca.algomau.showthemark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Scanner;


public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    Button btn1;
    public static final String VAL1 = "val1";
    public static final String VAL2 = "val2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        btn1 = (Button) findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String temp1 = et1.getText().toString();
                String temp2 = et2.getText().toString();
                Boolean flag1 = false;
                Boolean flag2 = false;

                Scanner scan = new Scanner(getResources().openRawResource(R.raw.exammarks));

                if((temp1.equals("")) || (temp2.equals(""))) {
                    Toast.makeText(MainActivity.this, "Please enter name/ID!", Toast.LENGTH_LONG).show();
                }
                else {
                    while (scan.hasNextLine()) {
                        String word1 = scan.next();
                        String word2 = scan.next();
                        String word3 = scan.next();

                        if (word1.equals(temp1) && word2.equals(temp2)) {
                            flag1 = true;
                            flag2 = true;
                            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                            intent.putExtra(VAL1, word1);
                            intent.putExtra(VAL2, word3);
                            startActivity(intent);
                            break;
                        }
                        else if(word1.equals(temp1)) {
                            flag1 = true;
                        }
                    }
                    scan.close();

                    if(flag1 == true && flag2 == false) {
                        Toast.makeText(MainActivity.this, "Wrong student ID!", Toast.LENGTH_LONG).show();
                        et2.setText("");
                    }
                    if(flag1 == false) {
                        Toast.makeText(MainActivity.this, "Student name does not exist!", Toast.LENGTH_LONG).show();
                        et1.setText("");
                        et2.setText("");
                    }
                }
            }
        });
    }
}
