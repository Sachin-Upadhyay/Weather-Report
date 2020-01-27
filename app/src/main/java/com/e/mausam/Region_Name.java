package com.e.mausam;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Region_Name extends AppCompatActivity {
    EditText region;
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region__name);
        region=findViewById(R.id.regionName);
        show=findViewById(R.id.showWeather);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=region.getText().toString();
                Intent intent = new Intent(Region_Name.this,MainActivity.class);
                intent.putExtra("data",name);
                startActivity(intent);
            }
        });
    }
}
