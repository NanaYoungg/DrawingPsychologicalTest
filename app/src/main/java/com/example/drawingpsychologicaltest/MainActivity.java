package com.example.drawingpsychologicaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.drawingpsychologicaltest.paint.ActivityPaint1;
import com.example.drawingpsychologicaltest.paint.ActivityPaint2;
import com.example.drawingpsychologicaltest.paint.ActivityPaint3;
import com.example.drawingpsychologicaltest.paint.ActivityPaint4;
import com.example.drawingpsychologicaltest.paint.ActivityPaint5;
import com.example.drawingpsychologicaltest.paint.ActivityPaint6;
import com.example.drawingpsychologicaltest.paint.ActivityPaint7;
import com.example.drawingpsychologicaltest.paint.ActivityPaint8;

public class MainActivity extends AppCompatActivity {
    private View mDecorView;
    private int	mUiOption;
    private Button mbtn1;
    private Button mbtn2;
    private Button mbtn3;
    private Button mbtn4;
    private Button mbtn5;
    private Button mbtn6;
    private Button mbtn7;
    private Button mbtn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        mDecorView = getWindow().getDecorView();
        mUiOption = getWindow().getDecorView().getSystemUiVisibility();
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH )
            mUiOption |= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN )
            mUiOption |= View.SYSTEM_UI_FLAG_FULLSCREEN;
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT )
            mUiOption |= View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

        mDecorView.setSystemUiVisibility( mUiOption );

        mbtn1 = (Button)findViewById(R.id.paint_btn1);
        mbtn2 = (Button)findViewById(R.id.paint_btn2);
        mbtn3 = (Button)findViewById(R.id.paint_btn3);
        mbtn4 = (Button)findViewById(R.id.paint_btn4);
        mbtn5 = (Button)findViewById(R.id.paint_btn5);
        mbtn6 = (Button)findViewById(R.id.paint_btn6);
        mbtn7 = (Button)findViewById(R.id.paint_btn7);
        mbtn8 = (Button)findViewById(R.id.paint_btn8);

//        for(int i=1; i<=8; i++){
//
//        }
        mbtn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ActivityPaint1.class);
                startActivity(intent);

            }
        });
        mbtn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ActivityPaint2.class);
                startActivity(intent);

            }
        });
        mbtn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ActivityPaint3.class);
                startActivity(intent);

            }
        });
        mbtn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ActivityPaint4.class);
                startActivity(intent);

            }
        });
        mbtn5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ActivityPaint5.class);
                startActivity(intent);

            }
        });
        mbtn6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ActivityPaint6.class);
                startActivity(intent);

            }
        });
        mbtn7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ActivityPaint7.class);
                startActivity(intent);

            }
        });
        mbtn8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ActivityPaint8.class);
                startActivity(intent);

            }
        });
    }
}