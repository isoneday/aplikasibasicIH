package com.imastudio.aplikasimultiplescreen.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.imastudio.aplikasimultiplescreen.R;
import com.imastudio.aplikasimultiplescreen.adapter.CustomGridAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GridViewActivity extends AppCompatActivity {

    @BindView(R.id.gridmakanan)
    GridView gridmakanan;
    String data_namaMakanan[] = {"rendang", "nasi kuning", "sate", "bakso"};
    int data_gambarMakanan[] = {R.drawable.rendang,R.drawable.nasikuning,R.drawable.sate,R.drawable.bakso};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        ButterKnife.bind(this);
//        ArrayAdapter adapter = new ArrayAdapter(this,
//                android.R.layout.simple_list_item_1,data_namaMakanan);

        CustomGridAdapter adapter = new CustomGridAdapter(GridViewActivity.this,data_namaMakanan,data_gambarMakanan);

        gridmakanan.setAdapter(adapter);

    }
}
