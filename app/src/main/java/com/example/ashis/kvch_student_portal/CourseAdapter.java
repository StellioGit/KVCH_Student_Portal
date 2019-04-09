package com.example.ashis.kvch_student_portal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ashis on 7/14/2018.
 */

public class CourseAdapter extends BaseAdapter {
    private Context context;
    private List<Course> list;

    public CourseAdapter(Context context, List<Course> list) {
        this.context = context;
        this.list = list;


    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater Inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=Inflater.inflate(R.layout.row_course,null);

        Course m=list.get(i);

        TextView txtmid=rowView.findViewById(R.id.txtmid);
        txtmid.setText(m.getId());
        TextView txtmcourse=rowView.findViewById(R.id.txtmcourse);
        txtmcourse.setText(m.getCourse());




        return rowView;
    }
}
