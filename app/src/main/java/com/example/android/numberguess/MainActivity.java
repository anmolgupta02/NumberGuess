package com.example.android.numberguess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv1 = (TextView) (findViewById(R.id.answer));
        final TextView tv2 = (TextView) findViewById(R.id.textView2);
        final EditText et1 = (EditText) findViewById(R.id.user);
        Button click = (Button) findViewById(R.id.click);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int userText = Integer.parseInt(et1.getText().toString());
                Random r = new Random();
                int rando = r.nextInt(5) + 1;
                String rText = Integer.toString(rando);
                if (userText < 1 || userText > 5)
                    tv2.setText("please enter the number between 1 to 5");
                else {

                    if
                            (userText == rando) tv1.setText("You Guessed it right.");
                    else
                             tv1.setText("Not This Time.Try Again");
                    tv2.setText(rText);
                }

            }
        });
    }
}





