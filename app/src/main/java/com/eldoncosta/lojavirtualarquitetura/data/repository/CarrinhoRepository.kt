package com.eldoncosta.lojavirtualarquitetura.data.repository

import com.eldoncosta.lojavirtualarquitetura.data.api.RetrofitClient
import com.eldoncosta.lojavirtualarquitetura.data.model.Carrinho

class CarrinhoRepository {
    private val api = RetrofitClient.apiService

    suspend fun buscarCarrinhos(): List<Carrinho>? {
        return try {
            val response = api.getCarrinhos()
            response.carts
        } catch (e: Exception) {
            null
        }
    }
}