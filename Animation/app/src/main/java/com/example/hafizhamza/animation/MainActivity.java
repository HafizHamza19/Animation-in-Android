package com.example.hafizhamza.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
public void Fade(View view)
{
    Log.i("info","Clicked");
    ImageView i=(ImageView)findViewById(R.id.imageView);
    i.animate().alpha(0).scaleY(-500).setDuration(3000);
}
    public void Fade2(View view)
    {
        Log.i("info","Clicked");
        ImageView i=(ImageView)findViewById(R.id.imageView2);
        i.animate().rotation(3600).setDuration(2000);

    }
    public void Fade3(View view)
    {
        Log.i("info","Clicked");
        ImageView i=(ImageView)findViewById(R.id.imageView3);
        i.animate().rotationX(180).translationX(400).setDuration(2000);


    }
    public void Fade4(View view)
    {
        Log.i("info","Clicked");
        ImageView i=(ImageView)findViewById(R.id.imageView4);
        i.animate().rotationY(180).translationX(-400).setDuration(2000);

    }
    public void Fade5(View view)
    {
        Log.i("info","Clicked");
        ImageView i=(ImageView)findViewById(R.id.imageView5);
        i.animate().scaleX(70).setDuration(2000);

    }
    public void Fade6(View view)
    {
        Log.i("info","Clicked");
        ImageView i=(ImageView)findViewById(R.id.imageView6);
        i.animate().scaleY(70).setDuration(2000);

    }
    public void Fade7(View view)
    {
        Log.i("info","Clicked");
        ImageView i=(ImageView)findViewById(R.id.imageView7);
        i.animate().translationX(1000).rotation(3600).setDuration(2000);

    }
    public void Fade8(View view)
    {
        Log.i("info","Clicked");
        ImageView i=(ImageView)findViewById(R.id.imageView8);
        i.animate().translationY(1000).rotation(1800).setDuration(2000);

    }
    public void Fade9(View view)
    {
        Log.i("info","Clicked");
        ImageView i=(ImageView)findViewById(R.id.imageView9);
        i.animate().yBy(-2000).rotation(3600).setDuration(2000);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
