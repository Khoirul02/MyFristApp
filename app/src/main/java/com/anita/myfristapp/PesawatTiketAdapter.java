package com.anita.myfristapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.TiketPesawatModel;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by 7 on 19/05/2018.
 */

public class PesawatTiketAdapter extends
    RecyclerView.Adapter<PesawatTiketAdapter.ViewHolder>{

    private Context context;
    private ArrayList<TiketPesawatModel> listTiketpesawat;

    public ArrayList<TiketPesawatModel> getListPesawat(){

        return listTiketpesawat;
    }


    public void setListTiketPesawat(ArrayList<TiketPesawatModel> listTiketPesawat){
        this.listTiketpesawat = listTiketPesawat;
    }
    public PesawatTiketAdapter(Context context){
        this.context=context;
    }



    @NonNull
    @Override
    public PesawatTiketAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_tiket_pesawat,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PesawatTiketAdapter.ViewHolder holder, int position) {
        holder.tvNamaPesawat.setText(getListPesawat().get(position).getNama());
        Glide.with(context).load(getListPesawat().get(position).getFoto()).error(R.drawable.airplane).into(holder.ivGambarPesawat);
    }

    @Override
    public int getItemCount() {
        return getListPesawat().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivGambarPesawat;
        private TextView tvNamaPesawat;
        public ViewHolder(View itemView) {
            super(itemView);
            ivGambarPesawat=(ImageView)itemView.findViewById(R.id.iv_row_gambar_pesawat);
            tvNamaPesawat=(TextView)itemView.findViewById(R.id.tv_nama_pesawawt);
        }
    }
}
