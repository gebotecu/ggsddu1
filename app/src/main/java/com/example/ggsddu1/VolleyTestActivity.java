package com.example.ggsddu1;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by Administrator on 2017/10/27.
 */

public class VolleyTestActivity extends Activity {

    private static final String TAG = "VolleyTestActivity";
    private Button mButton1;
    private Button mButton2;
    private TextView mTextView;
    private ImageView mImageView;
    private String mUrl1 = "https://www.baidu.com";
    private String mUrl2 = "http://p0.so.qhimgs1.com/t01e722ebfe6b17bd9c.jpg";
    private RequestQueue mRequestQueue;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.volly_test_activity);
        mRequestQueue = Volley.newRequestQueue(this);
        initView();
    }

    private void initView() {
        mButton1 = (Button) findViewById(R.id.button1);
        mButton2 = (Button) findViewById(R.id.button2);
        mTextView = (TextView) findViewById(R.id.textview);
        mImageView = (ImageView) findViewById(R.id.imageview);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: button1");
                downloadStringWithVolley(mUrl1);
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: button2");
                downloadImageWithVolley(mUrl2);
            }
        });
    }

    private void downloadImageWithVolley(String url) {
        ImageRequest ir = new ImageRequest(url, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                Log.i(TAG, "onResponse: ");
                mImageView.setImageBitmap(response);
            }
        }, 500, 500, Bitmap.Config.RGB_565, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i(TAG, "onErrorResponse: ");
            }
        });
        mRequestQueue.add(ir);
    }

    private void downloadStringWithVolley(String url) {
        StringRequest sr = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.i(TAG, "onResponse: "+response);
                mTextView.setText(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i(TAG, "onErrorResponse: "+error.toString());
            }
        });
        mRequestQueue.add(sr);
    }


}
