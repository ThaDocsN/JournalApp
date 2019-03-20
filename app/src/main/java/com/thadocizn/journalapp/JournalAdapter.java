package com.thadocizn.journalapp;

import android.support.annotation.NonNull;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class JournalAdapter extends ListAdapter<JournalAdapter, JournalAdapter.MyViewHolder> {
    protected JournalAdapter(@NonNull DiffUtil.ItemCallback<JournalAdapter> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public JournalAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull JournalAdapter.MyViewHolder myViewHolder, int i) {

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
