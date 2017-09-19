package com.krish.demo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.krish.demo.R;
import com.krish.demo.adapter.viewholder.NewsViewHolder;
import com.krish.demo.model.News;

import java.util.ArrayList;


public class HomeChildNewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<News> categoryNewsList;

    public HomeChildNewsAdapter(ArrayList<News> categoryNewsList) {
        this.categoryNewsList = categoryNewsList;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_child, parent, false);

        NewsViewHolder newsViewHolder = new NewsViewHolder(itemLayoutView);
        itemLayoutView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(itemLayoutView.getContext(), "Hello child click", Toast.LENGTH_SHORT).show();

            }
        });

        return newsViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        NewsViewHolder vh = (NewsViewHolder) holder;
        News c = categoryNewsList.get(position);
        vh.tv_child.setText(c.getChild_name());
    }

    @Override
    public int getItemCount() {
        return categoryNewsList.size();
    }
}
