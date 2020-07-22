package com.example.networking;

public class Mountain {
    //Member var
    private String name;
    private String location;
    private int height;

    //CONSTRUCTORS
    public Mountain(String inName,String inLocation, int inHeight){
        name = inName;
        location = inLocation;
        height = inHeight;

    }

    //Interface
    public String info(){
        String tmp= "";
        tmp+=name+" is located in mountain range "+location+" and reaches "+height+"m. above sea level.";
        return tmp;
    }

    @Override
    public String toString(){
        return name;
    }




}
