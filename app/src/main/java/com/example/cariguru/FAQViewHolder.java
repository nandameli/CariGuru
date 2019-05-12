package com.example.cariguru;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FAQViewHolder extends RecyclerView.ViewHolder {

    public TextView question, answer;

    public FAQViewHolder(@NonNull View itemView) {
        super(itemView);

        question = itemView.findViewById(R.id.question);
        answer = itemView.findViewById(R.id.answer);
    }

}