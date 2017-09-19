package com.krish.demo.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.krish.demo.R;

import butterknife.Bind;
import butterknife.ButterKnife;


public class ParentNewsViewHolder extends RecyclerView.ViewHolder {

    @Bind(R.id.tv_header)
    public TextView tv_header;
    @Bind(R.id.rv_child)
    public RecyclerView rv_child;

    public ParentNewsViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}