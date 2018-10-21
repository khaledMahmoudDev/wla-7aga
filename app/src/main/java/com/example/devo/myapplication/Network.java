package com.example.devo.myapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Network {
    public static String url = "http://souq.hardtask.co/app/app.asmx/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient()
    {
        if (retrofit == null)
        {
            retrofit = new Retrofit.Builder().baseUrl(url).
                    addConverterFactory(GsonConverterFactory.create()).
                    build();

        }
        return retrofit;
    }
}
