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

public class ProjectAdapter extends BaseAdapter {

    private Context context;
    private List<Project> list;

    public ProjectAdapter(Context context, List<Project> list) {
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
        View rowView=Inflater.inflate(R.layout.row_project,null);
        Project prj=list.get(i);
        TextView tprstdntid=rowView.findViewById(R.id.tprstdntid);
        tprstdntid.setText(prj.getStdntid());
        TextView tprbatch=rowView.findViewById(R.id.tprbatch);
        tprbatch.setText(prj.getBatchid());
        TextView tprdesc=rowView.findViewById(R.id.tprdesc);
        tprdesc.setText(prj.getDesc());
        TextView tprprjctname=rowView.findViewById(R.id.tprprjctname);
        tprprjctname.setText(prj.getPrjctname());
        TextView tprprjct=rowView.findViewById(R.id.tprprjct);
        tprprjct.setText(prj.getPrjctid());


        return rowView;
    }
}
