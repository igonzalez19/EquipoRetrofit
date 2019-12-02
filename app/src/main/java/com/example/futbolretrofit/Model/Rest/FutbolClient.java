package com.example.futbolretrofit.Model.Rest;


import com.example.futbolretrofit.Model.Entity.Equipo;
import com.example.futbolretrofit.Model.Entity.Jugador;

import java.util.ArrayList;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface FutbolClient {

    //EQUIPO

    @DELETE("equipo/{id}")
    retrofit2.Call<Integer> deleteEquipo(@Path("id") long id);

    @GET("equipo/{id}")
    retrofit2.Call<Equipo> getEquipo(@Path("id") long id);

    @GET("equipo")
    retrofit2.Call<ArrayList<Equipo>> getEquipos();

    @POST("equipo")
    retrofit2.Call<Long> postEquipo(@Body Equipo equipo);

    @PUT("equipo/ {id}")
    retrofit2.Call<Equipo> putEquipo(@Path("id") long id, @Body Equipo equipo);

    //JUGADORES

    @DELETE("jugadores/{id}")
    retrofit2.Call<Integer> deleteJugadores(@Path("id") long id);

    @GET("jugadores/{id}")
    retrofit2.Call<Jugador> getJugadores(@Path("id") long id);

    @GET("jugadores")
    retrofit2.Call<ArrayList<Jugador>> getJugadores();

    @POST("jugadores")
    retrofit2.Call<Long> postJugadores(@Body Jugador jugadores);

    @PUT("jugadores/{id}")
    retrofit2.Call<Jugador> putJugadores(@Path("id") long id, @Body Jugador jugadores);

    //IMÁGENES

    @Multipart
    @POST("upload")
    Call<String> fileUpload(@Part MultipartBody.Part file);
}
