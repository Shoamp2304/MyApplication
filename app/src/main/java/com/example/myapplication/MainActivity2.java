
package com.example.myapplication;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity2 extends AppCompatActivity {
    TextView bio, name,edit;
    ToggleButton toggleButton;
    ImageView image ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        String text1 = intent.getStringExtra("text1");
        String font = intent.getStringExtra("font");
        int profile = intent.getIntExtra("profile", R.drawable.profile);
        boolean darkMode = intent.getBooleanExtra("darkMode", false);

        bio = findViewById(R.id.bio);
        name = findViewById(R.id.name);
        image = findViewById(R.id.image);
        toggleButton = findViewById(R.id.toggleButton);
        edit = findViewById(R.id.edit);

        name.setText(text);
        bio.setText(text1);
        image.setImageResource(profile);

        if (font.equals("serif")) {
            name.setTypeface(Typeface.SERIF);
            bio.setTypeface(Typeface.SERIF);
        } else if (font.equals("bold")) {
            name.setTypeface(Typeface.DEFAULT_BOLD);
            bio.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            name.setTypeface(Typeface.DEFAULT);
            bio.setTypeface(Typeface.DEFAULT);
        }
        if (darkMode) {
            findViewById(R.id.main2).setBackgroundColor(Color.BLACK);
            edit.setTextColor(Color.WHITE);
            name.setTextColor(Color.WHITE);
            bio.setTextColor(Color.WHITE);


        } else {
            findViewById(R.id.main2).setBackgroundColor(Color.WHITE);
            edit.setTextColor(Color.BLACK);
            name.setTextColor(Color.BLACK);
            bio.setTextColor(Color.BLACK);

        }
    }
        public void changeColor(View view) {
            if (toggleButton.isChecked()) {
                toggleButton.setBackgroundColor(Color.GREEN);
            } else {
                toggleButton.setBackgroundColor(Color.RED);
            }
        }
        public void back(View view) {
            finish();
        }
    }
