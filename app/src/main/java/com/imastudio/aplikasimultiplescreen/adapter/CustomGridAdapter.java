package com.imastudio.aplikasimultiplescreen.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.imastudio.aplikasimultiplescreen.R;
import com.imastudio.aplikasimultiplescreen.activity.GridViewActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CustomGridAdapter extends BaseAdapter {

    GridViewActivity customListActivity;

    String[] data_namaMakanan;

    int[] data_gambarMakanan;

    //hubungkan variable dengan data yg dkrim dari constructor
    public CustomGridAdapter(GridViewActivity customListActivity, String[] data_namaMakanan, int[] data_gambarMakanan) {
        this.customListActivity = customListActivity;
        this.data_gambarMakanan = data_gambarMakanan;
        this.data_namaMakanan = data_namaMakanan;
    }

    @Override
    public int getCount() {
        return data_gambarMakanan.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //layanan yg membuat suatu tampilan dalam bentuk popup
        LayoutInflater inflater = (LayoutInflater) customListActivity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.tampilancustomgrid, null);
        ViewHolder  holder = new ViewHolder(convertView);
        //isi data
        holder.txtnamamakanan.setText(data_namaMakanan[position]);
        holder.imgmakanan.setImageResource(data_gambarMakanan[position]);
        return convertView;
    }

    static
    class ViewHolder {
        @BindView(R.id.imgmakanan)
        ImageView imgmakanan;
        @BindView(R.id.txtnamamakanan)
        TextView txtnamamakanan;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
