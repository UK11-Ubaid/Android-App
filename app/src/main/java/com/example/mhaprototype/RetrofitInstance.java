package com.example.mhaprototype;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit retrofit;
    private static final String BASEURL = "https://localhost:61135/"; //in place of your localhost use your IPV4Address



    //Gsonconverter converts json objects to java objects
    public static Retrofit getRetrofit(){
        //if there is no retrofit instance
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASEURL).addConverterFactory(GsonConverterFactory.create()).build();
        }

        //if it exists then just return
        return retrofit;
    }



}
