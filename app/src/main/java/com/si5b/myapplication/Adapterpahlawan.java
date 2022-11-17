package com.si5b.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapterpahlawan extends RecyclerView.Adapter<Adapterpahlawan.VHPahlawan>{
    private ArrayList<modelpahlawan> datapahlawan;
    private Context ctx;

    public Adapterpahlawan(ArrayList<modelpahlawan> datapahlawan, Context ctx) {
        this.datapahlawan = datapahlawan;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public VHPahlawan onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View VW = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new VHPahlawan(VW);
    }

    @Override
    public void onBindViewHolder(@NonNull VHPahlawan holder, int position) {
    modelpahlawan pahlwan = datapahlawan.get(position);
    holder.tvnama.setText(pahlwan.getNama());
    holder.tvTentang.setText(pahlwan.getTentang());
    }

    @Override
    public int getItemCount() {
        return datapahlawan.size();
    }

    public class VHPahlawan extends RecyclerView.ViewHolder {
        TextView tvnama, tvTentang;
        ImageView ivfoto;

        public VHPahlawan(@NonNull View itemView) {
            super(itemView);
            tvnama =itemView.findViewById(R.id.tv_nama);
            tvTentang =itemView.findViewById(R.id.tv_tentang);
            ivfoto =itemView.findViewById(R.id.iv_foto);
        }
    }
}
