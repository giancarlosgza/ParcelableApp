package giancarlosgarza.com.parcelableapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        String text2 = intent.getStringExtra(MainActivity.EXTRA_TEXT2);
        int number = intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);

        TextView name = (TextView) findViewById(R.id.name);
        TextView lastName = (TextView) findViewById(R.id.lastName);
        TextView age = (TextView) findViewById(R.id.age);

        name.setText(text);
        lastName.setText(text2);
        age.setText("" + number);
    }
}
