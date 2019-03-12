package com.example.songapi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SongApi {

    @GET("?method=tag.gettopalbums&tag=pop&api_key=b29a3cc065a9a2c2a71bfbf878b352f5&format=json")
    Call<SongList> getTop();

    @GET("?method=tag.gettopalbums&tag=rock&api_key=b29a3cc065a9a2c2a71bfbf878b352f5&format=json")
    Call<SongList> getRock();

    @GET("?method=tag.gettopalbums&tag=jazz&api_key=b29a3cc065a9a2c2a71bfbf878b352f5&format=json")
    Call<SongList> getSpain();
}