package com.example.networking;

public class Mountain {
    //Member var
    private String name;
    private String location;
    private int height;

    //CONSTRUCTORS
    Mountain(String inName, String inLocation, int inHeight){
        name = inName;
        location = inLocation;
        height = inHeight;

    }

    //Interface
    String info(){
        String tmp= "";
        tmp+=name+" is located in "+location+" and reaches "+height+"m. above sea level.";
        return tmp;
    }

    @Override
    public String toString(){
        return name;
    }

}
