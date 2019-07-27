package com.imastudio.aplikasimultiplescreen.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.imastudio.aplikasimultiplescreen.R;
import com.imastudio.aplikasimultiplescreen.adapter.CustomRecyclerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerActivity extends AppCompatActivity {

    String data_namaMakanan[] = {"rendang", "nasi kuning", "sate", "bakso"};
    int data_gambarMakanan[] = {R.drawable.rendang, R.drawable.nasikuning, R.drawable.sate, R.drawable.bakso};
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        ButterKnife.bind(this);

        CustomRecyclerAdapter adapter = new CustomRecyclerAdapter(RecyclerActivity.this,
                data_namaMakanan,data_gambarMakanan);
        recyclerView.setAdapter(adapter);
        //set jenis tampilan recycler
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
