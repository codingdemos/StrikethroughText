package com.codingdemos.strikethroughtext;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mText;
    Button mStrikeText;
    Button mButtonText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = findViewById(R.id.myText);
        mStrikeText = findViewById(R.id.btnStrikeText);
        mButtonText = findViewById(R.id.btnText);
        mStrikeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mText.getPaint().isStrikeThruText() && !mButtonText.getPaint().isStrikeThruText()) {
                    mText.setPaintFlags(mText.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                    mButtonText.setPaintFlags(mButtonText.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                } else {
                    mText.setPaintFlags(mText.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                    mButtonText.setPaintFlags(mButtonText.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                }

            }
        });

    }
}
