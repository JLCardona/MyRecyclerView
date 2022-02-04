package com.example.myrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolderDatos> {

    ArrayList<String> listData;

    public Adapter(ArrayList<String> listData) {
        this.listData = listData;
    }

    @androidx.annotation.NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@androidx.annotation.NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, null, false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@androidx.annotation.NonNull ViewHolderDatos viewHolderDatos, int i) {
        viewHolderDatos.asignarData(listData.get(i));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView data;

        public ViewHolderDatos(@androidx.annotation.NonNull View itemView) {
            super(itemView);
            data = (TextView) itemView.findViewById(R.id.dataId);
        }

        public void asignarData(String datas) {
            data.setText(datas);
        }
    }
}
