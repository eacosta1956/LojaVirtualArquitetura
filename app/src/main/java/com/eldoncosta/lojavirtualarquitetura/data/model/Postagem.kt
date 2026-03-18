package com.eldoncosta.lojavirtualarquitetura.data.model

data class PostagemResponse(
    val posts: List<Postagem> // O nome do campo no JSON da API é "posts"
)

data class Postagem(
    val id: Int,
    val title: String,
    val body: String,
    val userId: Int,
    val tags: List<String> = emptyList() // Adicionei as tags, que são interessantes visualmente
)