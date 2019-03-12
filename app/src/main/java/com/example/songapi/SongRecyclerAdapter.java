package com.example.songapi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;


public class SongRecyclerAdapter extends RecyclerView.Adapter<SongRecyclerAdapter.SongViewHolder>{

    List<Album> lista = new ArrayList<>();

    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemSong = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_song, parent, false);
        return new SongViewHolder(itemSong);
    }

    @Override
    public void onBindViewHolder(SongViewHolder holder, int position) {
        final Album album = lista.get(position);
        holder.SongTitle.setText("Album: " + album.name);
        holder.SongArtist.setText("Artista:" + album.artist.name);
        holder.ArtistID.setText("ID: " + album.mbid);
        holder.SongAlbum.setText("Top Posición: " + album.attr.rank);
        GlideApp.with(holder.itemView.getContext()).load(album.text).into(holder.SongImage);
    }

    @Override
    public int getItemCount() {
        return (lista != null ? lista.size() : 0);
    }

    public void setList(List<Album> albums){
        this.lista = albums;
    }

    class SongViewHolder extends RecyclerView.ViewHolder {
        private TextView SongArtist;
        private TextView SongTitle;
        private TextView ArtistID;
        private TextView SongAlbum;
        private ImageView SongImage;

        SongViewHolder(View itemMovie) {
            super(itemMovie);
            SongTitle = itemMovie.findViewById(R.id.song_title);
            SongArtist = itemMovie.findViewById(R.id.song_artist);
            ArtistID = itemMovie.findViewById(R.id.artist_id);
            SongAlbum = itemMovie.findViewById(R.id.album_name);
            SongImage = itemMovie.findViewById(R.id.album_coverart_100x100);
        }
    }
}

