package com.example.mywallpaper.data.remote

import com.example.mywallpaper.data.remote.model.Wallpaper
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author : Mingaleev.D
 * @data : 02.08.2023
 */

interface ApiService {

   @GET("random")
   suspend fun getHomeFromApi(@Query("page") page: Int?): Wallpaper
}