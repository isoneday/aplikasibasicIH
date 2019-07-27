package com.imastudio.aplikasimultiplescreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.imastudio.aplikasimultiplescreen.activity.CustomListActivity;
import com.imastudio.aplikasimultiplescreen.activity.GridViewActivity;
import com.imastudio.aplikasimultiplescreen.activity.ListViewActivity;
import com.imastudio.aplikasimultiplescreen.activity.RecyclerActivity;
import com.imastudio.aplikasimultiplescreen.activity.SpinnerActivity;
import com.imastudio.aplikasimultiplescreen.activity.WebViewActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    //todo 1 deklarasi variable scr global
  //scr tradisional
    Button btnlist,
            btnrecycler,
            btncustomlist;

   //scr modern
    @BindView(R.id.btnspinner)
    Button btnspinner;
    @BindView(R.id.btnGridview)
    Button btnGridview;
    @BindView(R.id.wvgoogle)
    Button wvgoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //todo 2 inisialisasi /binding id
        btnrecycler = findViewById(R.id.btnrcyclerview);
        btnlist = findViewById(R.id.btnListView);
        btncustomlist = findViewById(R.id.btncustomlist);

        //todo 3 aksi ketika masing" button diklik
//cara tradisional
        btnlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //perpindahan halaman
                startActivity(new Intent(MainActivity.this, ListViewActivity.class));
                //kill activity

            }
        });
        btnrecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RecyclerActivity.class));
                //kill activity


            }
        });
        btncustomlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CustomListActivity.class));
                //kill activity


            }
        });
    }
//scr modern / plugin
    @OnClick({R.id.btnspinner, R.id.btnGridview, R.id.wvgoogle})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnspinner:
                //
                startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
                //kill activity


                break;
            case R.id.btnGridview:
                //
                startActivity(new Intent(MainActivity.this, GridViewActivity.class));
                //kill activity


                break;
            case R.id.wvgoogle:
                startActivity(new Intent(MainActivity.this, WebViewActivity.class));
                //kill activity


                break;
        }
    }
}
