package com.gothems.recyclerviewsample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gothems.recyclerviewsample.model.MyDummyData;

import java.util.ArrayList;

/**
 * Created by Kundan Kamal on 1/28/2018.
 * Copyright (c)2018 AppsInvo.com
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    private Context context;
    private  ArrayList<MyDummyData> myDummyData;
    public MyAdapter(Context context, ArrayList<MyDummyData> myDummyData)
    {
        this.context=context;
        this.myDummyData=myDummyData;
    }


    /*
    * Create view of row item
    * and return the view to onBindViewHolder()
    *
    * */
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rootView= layoutInflater.inflate(R.layout.row_item,parent,false);
        MyHolder myHolder=new MyHolder(rootView);

        return myHolder;
    }



    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

        MyDummyData myDummyRawData=  myDummyData.get(position);
        holder.tvName.setText(myDummyRawData.getNameData());
        holder.tvAddress.setText(myDummyRawData.getAddressData());

    }


    @Override
    public int getItemCount() {
        return myDummyData.size();
    }


    /*
    *
    *
    * My Holder
    * */
    class MyHolder extends RecyclerView.ViewHolder
    {
        TextView tvName;
        TextView tvAddress;

        public MyHolder(View itemView) {
            super(itemView);
            tvName=(TextView) itemView.findViewById(R.id.tv_name);
            tvAddress=(TextView)itemView.findViewById(R.id.tv_address);
        }
    }
}
