package com.example.rohitgiri.vibhassignment82;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rohit giri on 29-10-2017.
 */


//Custom Adapter class which is ectending Base Adapter
public class CustomAdapter extends BaseAdapter {
    private Context mcontext;                       //creating object of Context
    private ArrayList<Itemdetails> mlist;           //creating object of Arraylist
    private LayoutInflater mlayoutinflater;          //object of layout Inflator to inflate xml file
    //Custom Adapter method
    public CustomAdapter(Context mainActivityClass ,ArrayList<Itemdetails> mlistdata)
    {
        mcontext=mainActivityClass;
        mlist=mlistdata;
        //getting access of Layout inflator service
        mlayoutinflater= (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    //method overriden by Base Adapter to getting count the number of items,postions of objects,and ids and getView
    //respectively
    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public Object getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return (long)position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=mlayoutinflater.inflate(R.layout.row,parent,false);   //inflating layout
        TextView textView= (TextView) convertView.findViewById(R.id.name);  //getting textView
        textView.setText(mlist.get(position).getName());                    //setting text view
        TextView textView1= (TextView) convertView.findViewById(R.id.phone);
        textView1.setText(mlist.get(position).getPhone());
        return convertView;                                                  //returing convert view
    }
}
