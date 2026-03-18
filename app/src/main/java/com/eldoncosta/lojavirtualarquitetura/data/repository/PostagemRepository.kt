package com.eldoncosta.lojavirtualarquitetura.data.repository

import com.eldoncosta.lojavirtualarquitetura.data.api.RetrofitClient
import com.eldoncosta.lojavirtualarquitetura.data.model.Postagem

class PostagemRepository {
    private val api = RetrofitClient.apiService

    suspend fun buscarPostagens(): List<Postagem>? {
        return try {
            val response = api.getPostagens()
            response.posts
        } catch (e: Exception) {
            null
        }
    }
}