package com.example.movieapi.network

interface MovieAPI {

    @GET("stores.json")
    fun getStore(): Single<StoreRest>
}