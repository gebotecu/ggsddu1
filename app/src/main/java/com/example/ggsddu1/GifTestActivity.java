package com.example.ggsddu1;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import pl.droidsonroids.gif.GifImageView;

/**
 * Created by Administrator on 2017/10/31.
 */

public class GifTestActivity extends Activity{

    private GifImageView mGifImageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gif_test_activity);
        mGifImageView = (GifImageView) findViewById(R.id.gifimageview);
        mGifImageView.setImageResource(R.mipmap.giftest);
    }
}
