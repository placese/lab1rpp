package com.example.laba1;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.Locale;

public class Home_Screen extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sacnivity);

        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear);

        RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"),
                RuleBasedNumberFormat.SPELLOUT);

        for(int i = 0; i < 10000; i++) {

            final View view = getLayoutInflater().inflate(R.layout.custom_layout, null);
            TextView text = (TextView) view.findViewById(R.id.text);
            ImageView img = (ImageView) view.findViewById(R.id.image);
            text.setText(" " + nf.format(i + 1));
            if(i % 2 == 0) {
                text.setBackgroundColor(Color.WHITE);
                img.setBackgroundColor(Color.WHITE);
            }
            else {
                text.setBackgroundColor(Color.GRAY);
                img.setBackgroundColor(Color.GRAY);
            }
            linearLayout.addView(view);
        }

    }
}
