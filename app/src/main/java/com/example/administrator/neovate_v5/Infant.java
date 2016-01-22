package com.example.administrator.neovate_v5;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/**
 * Created by Administrator on 12/26/2015.
 */
public class Infant implements Parcelable{
    public  String name;
    public String datebirth;
    public int sensornum;
    public double heartrate; //bpm
    public double resprate; //breaths per minute
    public double temp;
    public double oxsat;



    public Infant(String name, String datebirth, int sensornum, double heartrate, double resprate, double temp, double oxsat){
        Log.v("Parcel", "Hit constructor");
        this.name=name;
        this.datebirth=datebirth;
        this.sensornum=sensornum;
        this.heartrate=heartrate;
        this.resprate=resprate;
        this.temp=temp;
        this.oxsat=oxsat;
    }

    public Infant(Parcel input){
        Log.v("Parcel", "Hit parcel in in Infant.java");

        name = input.readString();
        datebirth=input.readString();
        sensornum=input.readInt();
        heartrate = input.readDouble();
        resprate = input.readDouble();
        temp = input.readDouble();
        oxsat = input.readDouble();

    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        Log.v("Parcel", "Hit writer in Infant.java");

        dest.writeString(name);
        dest.writeString(datebirth);
        dest.writeInt(sensornum);
        dest.writeDouble(heartrate);
        dest.writeDouble(resprate);
        dest.writeDouble(temp);
        dest.writeDouble(oxsat);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Infant> CREATOR = new Parcelable.Creator<Infant>() {
        @Override
        public Infant createFromParcel(Parcel in) {
            return new Infant(in);
        }

        @Override
        public Infant[] newArray(int size) {
            return new Infant[size];
        }
    };
}

