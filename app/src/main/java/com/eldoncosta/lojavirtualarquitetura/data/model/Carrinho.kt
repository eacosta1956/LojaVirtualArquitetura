package com.eldoncosta.lojavirtualarquitetura.data.model

data class CarrinhoResponse(
    val carts: List<Carrinho>
)

data class Carrinho(
    val id: Int,
    val total: Double,
    val discountedTotal: Double,
    val totalProducts: Int,
    val totalQuantity: Int
)