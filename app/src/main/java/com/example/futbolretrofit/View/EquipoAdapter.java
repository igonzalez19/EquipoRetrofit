package com.example.proyectoeloquentequipos.View;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.futbolretrofit.R;


public class EquipoAdapter extends RecyclerView.Adapter <EquipoAdapter.ItemHolder>{

    private LayoutInflater inflater;
    private Context context;

    public EquipoAdapter(Context context) {
        inflater=LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public EquipoAdapter.ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= inflater.inflate(R.layout.item_equipo,parent,false);
        return new ItemHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull EquipoAdapter.ItemHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        int elements=0;

        return elements;
    }


    public class ItemHolder extends RecyclerView.ViewHolder {
        private final TextView tvNombre, tvCiudad;
        private final Button btBorrar, btEditar;
        private ConstraintLayout cl;
        private ImageView ivImagen;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            tvNombre=itemView.findViewById(R.id.tvNombre);
            tvCiudad=itemView.findViewById(R.id.etCiudad);
            btBorrar=itemView.findViewById(R.id.btBorrar);
            btEditar=itemView.findViewById(R.id.btEditar);
            cl = itemView.findViewById(R.id.clEquipo);
            ivImagen = itemView.findViewById(R.id.ivImagen);
        }
    }
}
