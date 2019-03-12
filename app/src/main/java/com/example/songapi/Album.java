package com.example.songapi;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import com.google.gson.annotations.SerializedName;
import java.util.List;

@Entity
public class Album extends Image{

    @PrimaryKey(autoGenerate = true)

    public String name;
    public String mbid;
    public Artist artist;

    @SerializedName("#text")
    public String text;

    @SerializedName("@attr")
    public Attri attr;
}
