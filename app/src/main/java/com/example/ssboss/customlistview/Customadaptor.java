package com.example.ssboss.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SS BOSS on 10/4/2016.
 */
public class Customadaptor extends BaseAdapter {
    Context cts;
    ArrayList<Samplepojo> als;
    LayoutInflater li;

    public Customadaptor(Context cts,ArrayList<Samplepojo> als) {
        this.cts=cts;
        this.als=als;
        li=LayoutInflater.from(cts);

    }

    @Override
    public int getCount() {
        return als.size();
    }

    @Override
    public Object getItem(int position) {
        return als.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        VIEWHOLDER vh;
        View rowview = null;
        if (rowview == null) {
            rowview = li.inflate(R.layout.custom, null);
            vh = new VIEWHOLDER();
            vh.t1 = (TextView) rowview.findViewById(R.id.tv1);
            vh.t2 = (TextView) rowview.findViewById(R.id.re);
            vh.iv = (ImageView) rowview.findViewById(R.id.imageView);
            rowview.setTag(vh);

        } else {
            vh = (VIEWHOLDER) rowview.getTag();
        }
            vh.t1.setText(als.get(position).getS1());
            vh.t2.setText(als.get(position).getS2());
            vh.iv.setImageResource(als.get(position).getI());
            return rowview;

        }


    static class VIEWHOLDER{
        TextView t1,t2;
        ImageView iv;
    }
}
