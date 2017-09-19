package com.krish.demo.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.krish.demo.R;
import com.krish.demo.adapter.viewholder.ParentNewsViewHolder;
import com.krish.demo.model.ParentNews;

import org.solovyev.android.views.llm.DividerItemDecoration;
import org.solovyev.android.views.llm.LinearLayoutManager;

import java.util.ArrayList;

/**
 * Created by cliqers on 23/1/2016.
 */
public class HomesParentNewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<ParentNews> parentChildData;

    Context mContext;

    public HomesParentNewsAdapter(Context mContext, ArrayList<ParentNews> parentChildData) {
        this.mContext = mContext;
        this.parentChildData = parentChildData;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_parent, parent, false);
        return new ParentNewsViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ParentNewsViewHolder vh = (ParentNewsViewHolder) holder;
        ParentNews mParentNews = parentChildData.get(position);
        vh.tv_header.setText(mParentNews.getCategoryName());
        initChildLayoutManager(vh.rv_child, mParentNews);
    }

    private void initChildLayoutManager(RecyclerView rv_child, ParentNews parentNews) {
        if (parentNews.getCategoryName().equals("Header 3")) {
            LinearLayoutManager manager = new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false);
            rv_child.setLayoutManager(manager);
        } else {
            GridLayoutManager manager = new GridLayoutManager(mContext, 2, GridLayoutManager.VERTICAL, false);
            rv_child.setLayoutManager(manager);

        }
        rv_child.addItemDecoration(new DividerItemDecoration(ContextCompat.getDrawable(mContext, R.drawable.dssd), false, false));
        rv_child.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });

        HomeChildNewsAdapter homeChildNewsAdapter = new HomeChildNewsAdapter(parentNews.getNewsArrayList());
        rv_child.setAdapter(homeChildNewsAdapter);

    }

    @Override
    public int getItemCount() {
        return parentChildData.size();
    }
}
