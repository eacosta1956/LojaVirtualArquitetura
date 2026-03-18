package com.eldoncosta.lojavirtualarquitetura.data.api

import com.eldoncosta.lojavirtualarquitetura.data.model.CarrinhoResponse
import com.eldoncosta.lojavirtualarquitetura.data.model.ProdutoResponse
import com.eldoncosta.lojavirtualarquitetura.data.model.UsuarioResponse
import retrofit2.http.GET

interface ApiService {
    @GET("products")
    suspend fun getProdutos(): ProdutoResponse

    @GET("carts")
    suspend fun getCarrinhos(): CarrinhoResponse

    @GET("users")
    suspend fun getUsuarios(): UsuarioResponse
}