package com.imastudio.aplikasimultiplescreen.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.imastudio.aplikasimultiplescreen.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListViewActivity extends AppCompatActivity {


    //set data
    String data_namaMakanan[] = {"rendang", "ayam goreng", "sate", "bakso"};
    @BindView(R.id.lvmakanan)
    ListView lvmakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ButterKnife.bind(this);

      //untuk menghubungkan data dengan view -> adapter
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,data_namaMakanan);

        //isi adapter ke view
        lvmakanan.setAdapter(adapter);
    }
}
