package com.example.cognifyztask03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String CourseList[];

    LayoutInflater inflater;

    public CustomBaseAdapter(Context ctx, String[] courseList) {
        this.context= ctx;
        this.CourseList = courseList;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return CourseList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView textView = (TextView) convertView.findViewById(R.id.textView);
        textView.setText(CourseList[position]);
        return convertView;
    }
}
