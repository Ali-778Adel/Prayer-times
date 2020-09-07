package com.example.salatty.Contract;

import com.example.salatty.Pojo.ItemModel;

import java.util.List;

public interface SalatModelContract {

    interface Model{
        interface OnFinishedListener{
            void onFinished(List<ItemModel>itemModelList);
            void onFailure(Throwable throwable);
        }
            void getItemModelList(OnFinishedListener onFinishedListener);
    }
    interface View{
            void showProgress();
            void hideProgress();
            void setDataToRecyclerView(List<ItemModel>itemModelList);
            void onFailure(Throwable t);

    }
    interface Presenter{
        void onDestroy();
        void requestDataFromServer();

    }
}
