package com.krish.demo.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.krish.demo.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ParentNewsViewHolder extends RecyclerView.ViewHolder {

    public TextView tv_header;
    public RecyclerView rv_child;

    public ParentNewsViewHolder(View itemView) {
        super(itemView);
       tv_header=itemView.findViewById(R.id.tv_header);
       rv_child=itemView.findViewById(R.id.rv_child);
    }
}