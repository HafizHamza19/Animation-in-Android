package com.example.hafizhamza.animations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void Fade(View view)
    {
        Log.i("info","Hello");
       // ImageView i=(ImageView)findViewById(R.id.imageView);
       // i.animate().alpha(0).setDuration(2000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
