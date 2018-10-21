package com.example.devo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Cat> categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);


        ApiNetwork apiNetwork = Network.getClient().create(ApiNetwork.class);

        Call<List<Cat>> call = apiNetwork.getCategory(0,1);
        Log.d("+++mess", ""+call.request().url());

        call.enqueue(new Callback<List<Cat>>() {
            @Override
            public void onResponse(Call<List<Cat>> call, Response<List<Cat>> response) {
                categories = response.body();
                Log.d("++++",""+categories.size());
                Log.d("++++",""+categories.get(0).getSubCategories());
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                recyclerView.setAdapter(new Adapter(categories));

            }

            @Override
            public void onFailure(Call<List<Cat>> call, Throwable t) {

            }
        });



    }
}
