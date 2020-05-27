package sg.edu.rp.c346.id19032110.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //Event handling step 1
    Button btnPassInteger;
    Button btnpassChar;
    TextView tvDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling step 2
        btnPassInteger = findViewById(R.id.buttonPassInteger);
        btnpassChar = findViewById(R.id.buttonPassChar);
        tvDouble = findViewById(R.id.textViewDouble);

        //Event handling step 3
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("value",  1);
            startActivity(intent);
            }
        });

        btnpassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("character", 'a');
                startActivity(intent);
            }
        });

        tvDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FourthActivity.class);
                intent.putExtra("Double" , 99.99);
                startActivity(intent);
            }
        });
    }
}
