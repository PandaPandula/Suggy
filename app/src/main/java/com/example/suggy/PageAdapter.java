package com.example.suggy;

import android.graphics.pdf.PdfDocument;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PageAdapter extends RecyclerView.Adapter<PageAdapter.ViewHolder> {

    Integer[] im;

    public PageAdapter(Integer[] im){
        this.im = im;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_card,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PageAdapter.ViewHolder holder, int position) {
        holder.i.setBackgroundResource(im[position]);
    }

    @Override
    public int getItemCount() {
        return im.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView i;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            i = itemView.findViewById(R.id.userImage);
        }
    }
}
