package com.eldoncosta.lojavirtualarquitetura.data.model

data class Produto(
    val id: Int,
    val title: String,
    val description: String,
    val price: Double,
    val thumbnail: String // Imagem do produto
)

data class ProdutoResponse(
    val products: List<Produto>
)