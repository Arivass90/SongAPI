package com.example.songapi;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public class TabSong3 extends Fragment {
    SongViewModel songViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tabsong3, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.tabsong3);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        final SongRecyclerAdapter songRecyclerAdapter = new SongRecyclerAdapter();
        recyclerView.setAdapter(songRecyclerAdapter);

        songViewModel = ViewModelProviders.of(this).get(SongViewModel.class);

        songViewModel.getSpain().observe(this, new Observer<List<Album>>() {
            @Override
            public void onChanged(@Nullable List<Album> albums) {
                songRecyclerAdapter.setList(albums);
                songRecyclerAdapter.notifyDataSetChanged();
            }
        });
        return view;
    }
}
