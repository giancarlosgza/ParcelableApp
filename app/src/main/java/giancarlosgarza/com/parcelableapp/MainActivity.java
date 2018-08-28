package giancarlosgarza.com.parcelableapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "giancarlosgarza.com.parcelableapp.EXTRA_TEXT";
    public static final String EXTRA_TEXT2 = "giancarlosgarza.com.parcelableapp.EXTRA_TEXT2";
    public static final String EXTRA_NUMBER = "giancarlosgarza.com.parcelableapp.EXTRA_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2(){
        EditText name = (EditText) findViewById(R.id.name);
        String text = name.getText().toString();

        EditText lastName = (EditText) findViewById(R.id.lastName);
        String text2 = lastName.getText().toString();

        EditText age = (EditText) findViewById(R.id.age);
        int number = Integer.parseInt(age.getText().toString());



        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(EXTRA_TEXT, text);
        intent.putExtra(EXTRA_TEXT2, text2);
        intent.putExtra(EXTRA_NUMBER, number);
        startActivity(intent);
    }
}
