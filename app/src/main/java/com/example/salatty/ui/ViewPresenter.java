package com.example.salatty.ui;

import com.example.salatty.Contract.SalatModelContract;
import com.example.salatty.Pojo.ItemModel;
import com.example.salatty.Pojo.SalateApiModel;
import com.example.salatty.Service.SalatListitemModel;

import java.util.List;

import retrofit2.Call;

public class ViewPresenter implements SalatModelContract.Presenter,SalatModelContract.Model.OnFinishedListener {
    SalatModelContract.View salatModelContractView;
SalatModelContract.Model salatModelContractModel;

public ViewPresenter( SalatModelContract.View salatModelContractView){
    this.salatModelContractView=salatModelContractView;
    salatModelContractModel=new SalatListitemModel();
    }
@Override
    public void onDestroy() {
        this.salatModelContractView=null;
    }

    @Override
    public void requestDataFromServer() {
    if (salatModelContractView!=null){
        salatModelContractView.showProgress();

    };
        salatModelContractModel.getItemModelList(this);
    }



    @Override
    public void onFinished(List<ItemModel> itemModelList) {
    if(salatModelContractView!=null){
        salatModelContractView.hideProgress();
    }
        salatModelContractView.setDataToRecyclerView(itemModelList);
    }

    @Override
    public void onFailure(Throwable throwable) {

    }


}


