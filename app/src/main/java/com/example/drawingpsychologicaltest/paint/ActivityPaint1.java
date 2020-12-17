package com.example.drawingpsychologicaltest.paint;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.drawingpsychologicaltest.PaintView;
import com.example.drawingpsychologicaltest.R;

public class ActivityPaint1 extends AppCompatActivity {
    private PaintView paintView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.avtivity_paint1);

        paintView = (PaintView)findViewById(R.id.paintview);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getRealMetrics(metrics);
        paintView.init(metrics);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.normal:
                paintView.normal();
                return true;
            case R.id.clear:
                paintView.clear();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}


























