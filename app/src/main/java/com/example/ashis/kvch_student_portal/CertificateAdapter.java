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

public class CertificateAdapter extends BaseAdapter
{
    private final List<CertificateClass> list;
    private Context context;

    public CertificateAdapter(Context context, List<CertificateClass> list) {
        this.context = context;
        this.list = list;
    }



    @Override
    public int getCount() {
        return  list.size();
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
        View rowView=Inflater.inflate(R.layout.row_certificate,null);

        CertificateClass c=list.get(i);
        TextView txtname=rowView.findViewById(R.id.txtname);
        txtname.setText(c.getName());
        TextView txtcenter=rowView.findViewById(R.id.txtcenter);
        txtcenter.setText(c.getCenter());
        TextView txtqual=rowView.findViewById(R.id.txtqual);
        txtqual.setText(c.getQual());
        TextView txtprjct=rowView.findViewById(R.id.txtprjct);
        txtprjct.setText(c.getPrjctname());
        TextView txtemail=rowView.findViewById(R.id.txtemail);
        txtemail.setText(c.getEmail());
        TextView txtstrt=rowView.findViewById(R.id.txtstrt);
        txtstrt.setText(c.getStrt());
        TextView txtend=rowView.findViewById(R.id.txtend);
        txtend.setText(c.getEnd());
        TextView txtclgname=rowView.findViewById(R.id.txtclgname);
        txtclgname.setText(c.getClgname());
        TextView txtdurtion=rowView.findViewById(R.id.txtdurtion);
        txtdurtion.setText(c.getName());
        TextView txtfees=rowView.findViewById(R.id.txtfees);
        txtfees.setText(c.getFees());
        TextView txttech=rowView.findViewById(R.id.txttech);
        txttech.setText(c.getTech());
        TextView txtcontact=rowView.findViewById(R.id.txtcontact);
        txtcontact.setText(c.getContact()+"");
        TextView txtstdntid=rowView.findViewById(R.id.txtstdntid);
        txtstdntid.setText(c.getStdntid());


        return rowView;
    }
}
