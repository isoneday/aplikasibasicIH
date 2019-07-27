package com.imastudio.aplikasimultiplescreen.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.imastudio.aplikasimultiplescreen.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SpinnerActivity extends AppCompatActivity {

    @BindView(R.id.spinmakanan)
    Spinner spinmakanan;
    @BindView(R.id.imgmakanan)
    ImageView imgmakanan;
    @BindView(R.id.txtnamamakanan)
    TextView txtnamamakanan;
    String data_namaMakanan[] = {"rendang", "nasi kuning", "sate", "bakso"};
    int data_gambarMakanan[] = {R.drawable.rendang, R.drawable.nasikuning, R.drawable.sate, R.drawable.bakso};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, data_namaMakanan);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinmakanan.setAdapter(adapter);
        //aksi ketika spinner di pillih/diganti
        spinmakanan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txtnamamakanan.setText(data_namaMakanan[position]);
                imgmakanan.setImageResource(data_gambarMakanan[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
