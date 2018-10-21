package com.example.devo.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiNetwork {
    @GET("GetCategories")
    Call<List<Cat>> getCategory(@Query("categoryId") int catid, @Query("countryId") int cId);
}
