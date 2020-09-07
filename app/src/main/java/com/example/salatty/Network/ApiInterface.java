package com.example.salatty.Network;

import com.example.salatty.Pojo.SalateApiModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("london/weekly.json")
    public Call<SalateApiModel>getSalatData(@Query("api_key") String Api_Key);

}
