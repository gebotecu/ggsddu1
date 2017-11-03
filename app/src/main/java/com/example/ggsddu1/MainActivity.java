package com.example.ggsddu1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = "MainActivity";
    private Button mGaodemapButton;
    private Button mVolleyTestButton;
    private Button mGifTestButton;
    private Button mPullToRefreshButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {
        mGaodemapButton = (Button) findViewById(R.id.gaodemap);
        mGaodemapButton.setOnClickListener(this);
        mVolleyTestButton = (Button) findViewById(R.id.volley_test);
        mVolleyTestButton.setOnClickListener(this);
        mGifTestButton = (Button) findViewById(R.id.gif_test);
        mGifTestButton.setOnClickListener(this);
        mPullToRefreshButton = (Button) findViewById(R.id.pulltorefresh_test);
        mPullToRefreshButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.gaodemap:
                Log.i(TAG, "onClick:---R.id.gaodemap");
                Intent intent1 = new Intent();
                intent1.setClass(this, GaodeMapActivity.class);
                startActivity(intent1);
                break;
            case R.id.volley_test:
                Log.i(TAG, "onClick:---R.id.volleytest");
                Intent intent2 = new Intent();
                intent2.setClass(this, VolleyTestActivity.class);
                startActivity(intent2);

            case R.id.gif_test:
                Log.i(TAG, "onClick:---R.id.giftest");
                Intent intent3 = new Intent();
                intent3.setClass(this, GifTestActivity.class);
                startActivity(intent3);
            case R.id.pulltorefresh_test:
                Log.i(TAG, "onClick:---R.id.pulltorefresh_test");
                Intent intent4 = new Intent();
                intent4.setClass(this, PullToRefreshTestActivity.class);
                startActivity(intent4);

        }
    }
}
