
package com.example.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView pf1;
    EditText txt1, txt2;
    RadioGroup radioGroup;
    RadioButton btn1, btn2, btn3;
    ImageButton ar1, ar2;
    Switch darkMode;
    int profileResource = R.drawable.profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pf1 = findViewById(R.id.pf1);
        ar1 = findViewById(R.id.ar1);
        ar2 = findViewById(R.id.ar2);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        radioGroup = findViewById(R.id.radioGroup);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        darkMode = findViewById(R.id.darkMode);
    }

    public void changephoto(View view) {
        if (view.getId() == R.id.ar1) {
            profileResource = R.drawable.profile2;
            pf1.setImageResource(profileResource);
        }

        if (view.getId() == R.id.ar2) {
            profileResource = R.drawable.profile;
            pf1.setImageResource(profileResource);
        }
    }

    public void changefont(View view) {
        if (view.getId() == R.id.btn1) {
            txt1.setTypeface(Typeface.SERIF);
            txt2.setTypeface(Typeface.SERIF);
        }
        if (view.getId() == R.id.btn2) {
            txt1.setTypeface(Typeface.DEFAULT_BOLD);
            txt2.setTypeface(Typeface.DEFAULT_BOLD);
        }
        if (view.getId() == R.id.btn3) {
            txt1.setTypeface(Typeface.MONOSPACE);
            txt2.setTypeface(Typeface.MONOSPACE);
        }
    }

    public void changeScreen(View view) {
        String text = txt1.getText().toString();
        String text1 = txt2.getText().toString();
        String font = "default";
        if (btn1.isChecked()) {
            font = "serif";
        }
        else if (btn2.isChecked()) {
            font = "bold";
        }
        else if (btn3.isChecked()) {
            font = "monospace";
        }
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("text", text);
        intent.putExtra("text1", text1);
        intent.putExtra("font", font);
        intent.putExtra("profile", profileResource);
        intent.putExtra("darkMode", darkMode.isChecked());
        startActivity(intent);
    }
}
