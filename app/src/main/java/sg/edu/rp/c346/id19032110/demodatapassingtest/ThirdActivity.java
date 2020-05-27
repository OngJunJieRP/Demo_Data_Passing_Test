package sg.edu.rp.c346.id19032110.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    //Event handling step 1
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Event handling step 2
        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        char character = intentReceived.getCharExtra("value", 'a');
        tvAnswer.setText("Character value received is: " + character);
    }
}
