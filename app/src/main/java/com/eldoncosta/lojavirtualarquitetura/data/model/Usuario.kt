package com.eldoncosta.lojavirtualarquitetura.data.model

data class UsuarioResponse(
    val users: List<Usuario>
)

data class Usuario(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val email: String,
    val image: String // URL da foto do usuário
)