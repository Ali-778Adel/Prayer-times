package com.example.salatty.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.salatty.Contract.SalatModelContract;
import com.example.salatty.Pojo.ItemModel;
import com.example.salatty.Pojo.SalateApiModel;
import com.example.salatty.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements SalatModelContract.View {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private DividerItemDecoration dividerItemDecoration;
    private ViewPresenter viewPresenter;
    private List<ItemModel>itemModelList;
    private  RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        itemModelList=new ArrayList<>();
        Context context;

        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        viewPresenter=new ViewPresenter(this);
        viewPresenter.requestDataFromServer();
        recyclerViewAdapter=new RecyclerViewAdapter(itemModelList,this);
        recyclerView.setAdapter(recyclerViewAdapter);
}





    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setDataToRecyclerView(List<ItemModel> itemModelList) {
itemModelList.addAll(itemModelList);

    }

    @Override
    public void onFailure(Throwable t) {

    }
};
