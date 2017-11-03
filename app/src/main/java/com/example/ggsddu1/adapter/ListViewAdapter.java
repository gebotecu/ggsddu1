package com.example.ggsddu1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ggsddu1.R;

import java.util.List;

/**
 * Created by Administrator on 2017/11/1.
 */

public class ListViewAdapter extends BaseAdapter{

    private static final String TAG = "ListViewAdapter";
    private Context mContext;
    private List<String> mDatas;

    public ListViewAdapter(Context context,List<String> datas){
        mContext = context;
        mDatas = datas;
    }
    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.listview_item,null);
            viewHolder = new ViewHolder();
            viewHolder.textView = (TextView) convertView.findViewById(R.id.textview);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.textView.setText(mDatas.get(position));
        return convertView;
    }

    class ViewHolder{
        TextView textView;
    }
}
