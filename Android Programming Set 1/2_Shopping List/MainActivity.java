package ca.algomau.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> myArray = new ArrayList<>();
    private ArrayAdapter<String> myAdapter;
    private ListView myList;
    private EditText insertBox;
    private Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBtn = (Button) findViewById(R.id.addBtn);
        insertBox = (EditText) findViewById(R.id.insertBox);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = insertBox.getText().toString();
                myArray.add(item);
                myAdapter.notifyDataSetChanged();
            }
        });

        myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myArray);
        myList = (ListView) findViewById(R.id.mylist);
        myList.setAdapter(myAdapter);

        myList.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                myArray.remove(position);
                myAdapter.notifyDataSetChanged();
                return false;
            }
        });

    }
}
