package com.test.ratingbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.test.ratingbar.view.RatingBar;

public class MainActivity extends AppCompatActivity {

    private RatingBar mRatingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView(){
        mRatingBar = (com.test.ratingbar.view.RatingBar) findViewById(R.id.star);
    }

    private void initData(){
        mRatingBar.setClickable(true);
        mRatingBar.setStar(3.5f);
        mRatingBar.setStepSize(RatingBar.StepSize.Half);//设置每次点击增加一颗星还是半颗星
        mRatingBar.setOnRatingChangeListener(new RatingBar.OnRatingChangeListener() {
            @Override
            public void onRatingChange(float ratingCount) {//点击星星变化后选中的个数
                Log.d("RatingBar","RatingBar-Count="+ratingCount);
            }
        });


    }
}
