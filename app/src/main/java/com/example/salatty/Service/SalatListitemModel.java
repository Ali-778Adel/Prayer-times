package com.example.salatty.Service;

import android.util.Log;

import com.example.salatty.Contract.SalatModelContract;
import com.example.salatty.Network.ApiClient;
import com.example.salatty.Network.ApiInterface;
import com.example.salatty.Pojo.ItemModel;
import com.example.salatty.Pojo.SalateApiModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SalatListitemModel implements SalatModelContract.Model {
    public static final String TAG="SalatListitemModel";
    @Override
    public void getItemModelList(OnFinishedListener onFinishedListener) {
        // ask retrofit builder to build apiInterface
        ApiInterface apiInterface= ApiClient.getClient().create(ApiInterface.class);
        Call<SalateApiModel>call=apiInterface.getSalatData("258e12dffa2c7187ddaa74109c5dcea3");
        call.enqueue(new Callback<SalateApiModel>() {
            @Override
            public void onResponse(Call<SalateApiModel> call, Response<SalateApiModel> response) {
                List<ItemModel>itemModels=response.body().getItems();

                Log.e(TAG, "onResponse: "+itemModels.size() );

                onFinishedListener.onFinished(itemModels);
            }

            @Override
            public void onFailure(Call<SalateApiModel> call, Throwable t) {
                Log.e(TAG, "onFailure: "+t.toString() );
                onFinishedListener.onFailure(t);
            }
        });
    }
}
