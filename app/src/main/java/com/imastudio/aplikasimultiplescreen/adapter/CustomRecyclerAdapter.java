package com.imastudio.aplikasimultiplescreen.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.imastudio.aplikasimultiplescreen.R;
import com.imastudio.aplikasimultiplescreen.activity.RecyclerActivity;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder> {
    RecyclerActivity recyclerActivit;
    String[] data_namaMakanan;
    int[] data_gambarMakanan;
    public CustomRecyclerAdapter(RecyclerActivity recyclerActivity, String[] data_namaMakanan, int[] data_gambarMakanan) {
        this.recyclerActivit= recyclerActivity;
        this.data_namaMakanan= data_namaMakanan;
        this.data_gambarMakanan=data_gambarMakanan;
    }
//todo 2.1 set view
    @NonNull
    @Override
    public CustomRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = (LayoutInflater)recyclerActivit
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      View v = inflater.inflate(R.layout.tampilanrecyclerview, null);
       MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }
//todo 2.3 set data ke view
    @Override
    public void onBindViewHolder(@NonNull CustomRecyclerAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.txtnamamakanan.setText(data_namaMakanan[i]);
        myViewHolder.imgmakanan.setImageResource(data_gambarMakanan[i]);
    }
//get jumlah data yang akan ditambilkan
    @Override
    public int getItemCount() {
        return data_gambarMakanan.length;
    }

    // todo 2.2 binding atau inisialisasi
    public class MyViewHolder extends RecyclerView.ViewHolder {
      ImageView imgmakanan;
      TextView txtnamamakanan;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgmakanan = itemView.findViewById(R.id.imgmakanan);
            txtnamamakanan = itemView.findViewById(R.id.txtnamamakanan);
        }
    }
}
