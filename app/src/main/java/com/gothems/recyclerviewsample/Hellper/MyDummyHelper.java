package com.gothems.recyclerviewsample.Hellper;

import com.gothems.recyclerviewsample.model.MyDummyData;

import java.util.ArrayList;

/**
 * Created by Kundan Kamal on 1/28/2018.
 * Copyright (c)2018 AppsInvo.com
 */

public class MyDummyHelper {

    public static ArrayList<MyDummyData>  dummyData()
    {

        ArrayList<MyDummyData> myDummyListData=new ArrayList<MyDummyData>();
        for(int  i=0;i<20;i++)
        {
            MyDummyData myDummyData=new MyDummyData();
            myDummyData.setNameData("Name--"+i);
            myDummyData.setAddressData("Address--"+i);
            myDummyListData.add(myDummyData);
        }

        return myDummyListData;

    }
}
