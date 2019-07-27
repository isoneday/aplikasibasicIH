package com.imastudio.aplikasimultiplescreen.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.imastudio.aplikasimultiplescreen.R;
import com.imastudio.aplikasimultiplescreen.adapter.CustomListAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CustomListActivity extends AppCompatActivity {

    @BindView(R.id.lvmakanan)
    ListView lvmakanan;
    //set data
    String data_namaMakanan[] = {"rendang", "nasi kuning", "sate", "bakso"};
    int data_gambarMakanan[] = {R.drawable.rendang,R.drawable.nasikuning,R.drawable.sate,R.drawable.bakso};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        ButterKnife.bind(this);

        CustomListAdapter adapter = new CustomListAdapter(CustomListActivity.this,data_namaMakanan,data_gambarMakanan);
        lvmakanan.setAdapter(adapter);
    }
}
