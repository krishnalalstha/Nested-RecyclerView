package com.krish.demo.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.krish.demo.R;


import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by brainnovation on 9/19/17.
 */

public class NewsViewHolder extends RecyclerView.ViewHolder {


    public TextView tv_child;

    public NewsViewHolder(View itemView) {
        super(itemView);
       tv_child=itemView.findViewById(R.id.tv_child);
    }
}
