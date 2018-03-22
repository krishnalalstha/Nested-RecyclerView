package com.krish.demo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.krish.demo.R;
import com.krish.demo.adapter.HomesParentNewsAdapter;
import com.krish.demo.model.News;
import com.krish.demo.model.ParentNews;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A placeholder fragment containing a simple view.
 */
public class ParentFragment extends Fragment {

    private static final String TAG = ParentFragment.class.getSimpleName();


    RecyclerView recyclerViewParent;

    ArrayList<ParentNews> parentChildObj;


    public ParentFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_parent, container, false);
       recyclerViewParent=rootView.findViewById(R.id.rv_parent);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewParent.setLayoutManager(manager);
        recyclerViewParent.setHasFixedSize(true);
        HomesParentNewsAdapter homesParentNewsAdapter = new HomesParentNewsAdapter(getActivity(), getParentChildData());
        recyclerViewParent.setAdapter(homesParentNewsAdapter);
    }

    private ArrayList<ParentNews> getParentChildData() {
        parentChildObj = new ArrayList<>();
        ArrayList<News> c1List = new ArrayList<>();
        ArrayList<News> c2List = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            News c1 = new News();
            c1.setChild_name("Child 1." + (i + 1));
            c1List.add(c1);
        }

        for (int i = 0; i < 5; i++) {
            News c2 = new News();
            c2.setChild_name("chlid 2." + (i + 1));
            c2List.add(c2);
        }

        ParentNews pc1 = new ParentNews();
        pc1.setCategoryName("Header 1");
        pc1.setNewsArrayList(c1List);
        parentChildObj.add(pc1);

        ParentNews pc2 = new ParentNews();
        pc2.setCategoryName("Header 2");
        pc2.setNewsArrayList(c2List);
        parentChildObj.add(pc2);


        ParentNews pc3 = new ParentNews();
        pc3.setCategoryName("Header 3");
        pc3.setNewsArrayList(c2List);
        parentChildObj.add(pc3);


        return parentChildObj;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
