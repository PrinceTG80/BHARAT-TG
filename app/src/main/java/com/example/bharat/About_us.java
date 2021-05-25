package com.example.bharat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class About_us extends AppCompatActivity {

    private Button tus,vais,yees,shru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        tus = (Button) findViewById(R.id.Tushar_link);
        vais = (Button) findViewById(R.id.Vaishnavi_link);
        yees = (Button) findViewById(R.id.Yeeshant_link);
        shru = (Button) findViewById(R.id.Shruti_link);

        tus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.linkedin.com/in/tushar-gavkhare-243ab5203/";
                Intent t = new Intent(Intent.ACTION_VIEW);
                t.setData(Uri.parse(url));
                startActivity(t);
            }
        });

        vais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.instagram.com/vaishnavi_bhadalee/";
                Intent va = new Intent(Intent.ACTION_VIEW);
                va.setData(Uri.parse(url));
                startActivity(va);
            }
        });

        yees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.instagram.com/yeeshantdahikar/";
                Intent y= new Intent(Intent.ACTION_VIEW);
                y.setData(Uri.parse(url));
                startActivity(y);
            }
        });

        shru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.linkedin.com/in/shrutisharma0502/";
                Intent s = new Intent(Intent.ACTION_VIEW);
                s.setData(Uri.parse(url));
                startActivity(s);
            }
        });

    }
}