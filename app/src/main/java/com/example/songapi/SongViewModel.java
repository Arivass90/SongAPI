package com.example.songapi;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import java.util.List;

public class SongViewModel extends AndroidViewModel {

    private SongRepository songRepository;

    public SongViewModel(Application application) {
        super(application);
        songRepository = new SongRepository(application);
    }

    public LiveData<List<Album>> getTop() { return songRepository.getTop(); }
    public LiveData<List<Album>> getRock() { return songRepository.getRock(); }
    public LiveData<List<Album>> getSpain() { return songRepository.getSpain(); }

}


