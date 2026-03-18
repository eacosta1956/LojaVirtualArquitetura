package com.eldoncosta.lojavirtualarquitetura.data.repository

import com.eldoncosta.lojavirtualarquitetura.data.api.RetrofitClient
import com.eldoncosta.lojavirtualarquitetura.data.model.Usuario

class UsuarioRepository {
    private val api = RetrofitClient.apiService

    suspend fun buscarUsuarios(): List<Usuario>? {
        return try {
            val response = api.getUsuarios()
            response.users
        } catch (e: Exception) {
            null
        }
    }
}