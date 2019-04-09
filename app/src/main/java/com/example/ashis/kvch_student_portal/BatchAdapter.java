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

public class BatchAdapter extends BaseAdapter {

    private Context context;
    private List<Batch> list;

    public BatchAdapter(Context context, List<Batch> list) {
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
        View rowView=Inflater.inflate(R.layout.row_batch,null);

        Batch b=list.get(i);
        TextView tbno=rowView.findViewById(R.id.tbno);
        tbno.setText(b.getBatchno());
        TextView tbid =rowView.findViewById(R.id.tbid);
        tbid.setText(b.getId());
        TextView tbcourse=rowView.findViewById(R.id.tbcourse);
        tbcourse.setText(b.getCourse());
        TextView tbtrainer=rowView.findViewById(R.id.tbtrainer);
        tbtrainer.setText(b.getTrainer());

        return rowView;
    }
}
