package com.eldoncosta.lojavirtualarquitetura.data.repository

import com.eldoncosta.lojavirtualarquitetura.data.api.RetrofitClient
import com.eldoncosta.lojavirtualarquitetura.data.model.Produto

class ProdutoRepository {
    private val api = RetrofitClient.apiService

    suspend fun buscarProdutos(): List<Produto>? {
        // Tenta buscar da API dummyjson.com
        return try {
            val response = api.getProdutos()
            response.products
        } catch (e: Exception) {
            null
        }
    }
}