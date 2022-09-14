package com.ganna.paginatedcompose.data.network

import com.ganna.paginatedcompose.data.UserResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {
    @GET("users")
    suspend fun getUserList(@Query("page") page: Int) : UserResponse
}