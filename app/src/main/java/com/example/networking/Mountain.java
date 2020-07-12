package com.example.networking;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Mountain {

    private String name;
    private String location;
    private int height;
    private String[] mountainNames = {"K2","Kilimanjaro","Matterhorn","Mount Everest"};
    private ArrayList<String> listData= new ArrayList<>(Arrays.asList(mountainNames));






    public Mountain(String inName,String inLocation, int inHeight){
        name=inName;
        location=inLocation;
        height=inHeight;

    }

    public Mountain(String inName){
        name=inName;
        location="";
        height=-1;
    }
    public String info(){
        String tmp= "";
        tmp+=name+" is located in mountain range "+location+" and reaches "+height+"m. above sea level.";
        return tmp;
    }

    public void setName(String inName){
        name=inName;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name;
    }




}
