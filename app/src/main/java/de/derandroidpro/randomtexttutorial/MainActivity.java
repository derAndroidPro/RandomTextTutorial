package de.derandroidpro.randomtexttutorial;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button uebernehmenBTN, auslesenBTN;
    EditText editText;
    TextView textView;

    ArrayList<String> alleTexteArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alleTexteArrayList = new ArrayList<>();

        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);
        uebernehmenBTN = (Button) findViewById(R.id.button);
        uebernehmenBTN.setOnClickListener(this);
        auslesenBTN = (Button) findViewById(R.id.button2);
        auslesenBTN.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button:{
                alleTexteArrayList.add(editText.getText().toString());
                editText.setText(null);

                break;
            }

            case R.id.button2:{
                if(! alleTexteArrayList.isEmpty()) {
                    String randomText = alleTexteArrayList.get(new Random().nextInt(alleTexteArrayList.size()));
                    textView.setText(randomText);
                }

                break;
            }

        }


    }
}
