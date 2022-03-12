package com.example.magic;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardHolder> {

    private Context context;
    private List<Card> cardList;

    public CardAdapter(Context context, List<Card> cards){
        this.context = context;
        cardList = cards;
    }

    @NonNull
    @Override
    public CardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new CardHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardHolder holder, int position) {
        Card card = cardList.get(position);
        holder.nombre.setText(card.getNombre());
        holder.descripcion.setText(card.getDescripcion());
        holder.imageView.setImageResource(card.getImagen());
        holder.setIsRecyclable(false);
        Log.d("prueba", card.toString());

    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public class CardHolder extends  RecyclerView.ViewHolder{

        ImageView imageView;
        TextView nombre, descripcion;

        public CardHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            nombre = itemView.findViewById(R.id.txtNombre);
            descripcion = itemView.findViewById(R.id.txtDescripcion);
        }
    }
}
