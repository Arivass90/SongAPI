package com.example.songapi;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.View;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SongRepository {

    private SongApi sSongApi;


    public SongRepository(Application application){
        sSongApi = SongModule.getAPI();
    }

    LiveData<List<Album>> getTop() {
        final MutableLiveData<List<Album>> lista = new MutableLiveData<>();
        sSongApi.getTop().enqueue(new Callback<SongList>() {

            @Override
            public void onResponse(Call<SongList> call, Response<SongList> response) {
                lista.setValue(response.body().albums.album);
            }
            @Override
            public void onFailure(Call<SongList> call, Throwable t) {

            }
        });
        return lista;
    }

    LiveData<List<Album>> getRock() {
        final MutableLiveData<List<Album>> lista = new MutableLiveData<>();
        sSongApi.getRock().enqueue(new Callback<SongList>() {

            @Override
            public void onResponse(Call<SongList> call, Response<SongList> response) {
                lista.setValue(response.body().albums.album);
            }
            @Override
            public void onFailure(Call<SongList> call, Throwable t) {
            }
        });
        return lista;
    }

    LiveData<List<Album>> getSpain() {
        final MutableLiveData<List<Album>> lista = new MutableLiveData<>();
        sSongApi.getSpain().enqueue(new Callback<SongList>() {

            @Override
            public void onResponse(Call<SongList> call, Response<SongList> response) {
                lista.setValue(response.body().albums.album);
            }
            @Override
            public void onFailure(Call<SongList> call, Throwable t) {
            }
        });
        return lista;
    }


    }



