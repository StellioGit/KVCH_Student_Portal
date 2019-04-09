package com.example.ashis.kvch_student_portal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ashis on 7/13/2018.
 */

public class ProfileAdapter extends BaseAdapter {

    private final List<MyProfileClass> list;
    private Context context;

    public ProfileAdapter(Context list, List<MyProfileClass> context) {
        this.list = (List<MyProfileClass>) list;
        this.context = (Context) context;

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
        LayoutInflater Inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = Inflater.inflate(R.layout.row_profile, null);

        MyProfileClass p = list.get(i);
        TextView txtpname = rowView.findViewById(R.id.txtpname);
        txtpname.setText(p.getName());
        TextView txtpemail = rowView.findViewById(R.id.txtpemail);
        txtpemail.setText(p.getEmail());
        TextView txtpqual = rowView.findViewById(R.id.txtpqual);
        txtpqual.setText(p.getQual());
        TextView txtpaddress= rowView.findViewById(R.id.txtpaddress);
        txtpaddress.setText(p.getAddress());
        TextView txtpcity = rowView.findViewById(R.id.txtpcity);
        txtpcity.setText(p.getCity());
        TextView txtpstate = rowView.findViewById(R.id.txtpstate);
        txtpstate.setText(p.getState());
        TextView txtpclgname = rowView.findViewById(R.id.txtpclgname);
        txtpclgname.setText(p.getCollege());
        TextView txtpcontact = rowView.findViewById(R.id.txtpcontact);
        txtpcontact.setText(p.getContact() + "");

        return rowView;
    }
}
