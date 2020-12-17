package com.example.drawingpsychologicaltest.paint;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.drawingpsychologicaltest.PaintView;
import com.example.drawingpsychologicaltest.R;
import com.example.drawingpsychologicaltest.result.ResultActivity2;
import com.example.drawingpsychologicaltest.result.ResultActivity4;

public class ActivityPaint4 extends AppCompatActivity {
    public PaintView paintView;
    private Button mDoneBtn;
    private ImageButton mClearBtn;

    private View mDecorView;
    private int	mUiOption;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.avtivity_paint4);

        mDecorView = getWindow().getDecorView();
        mUiOption = getWindow().getDecorView().getSystemUiVisibility();
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH )
            mUiOption |= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN )
            mUiOption |= View.SYSTEM_UI_FLAG_FULLSCREEN;
        if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT )
            mUiOption |= View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

        mDecorView.setSystemUiVisibility( mUiOption );

        //완성화면으로, 그림결과 넘겨주기
        mDoneBtn = (Button)findViewById(R.id.done_btn);
        mDoneBtn.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ResultActivity4.class);

                startActivity(intent);

            }
        });
        //지우개 버튼
        mClearBtn = (ImageButton)findViewById(R.id.eraser_img_btn);
        mClearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.clear();
            }
        });


        paintView = (PaintView)findViewById(R.id.paintview);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getRealMetrics(metrics);
        paintView.init(metrics);

    }


}


























