package com.eldoncosta.lojavirtualarquitetura.ui.usuarios

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.eldoncosta.lojavirtualarquitetura.databinding.ActivityUsuariosBinding

class UsuariosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUsuariosBinding
    private val viewModel: UsuarioViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializando o ViewBinding para esta tela
        binding = ActivityUsuariosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configura um título na barra superior para teste
        supportActionBar?.title = "Lista de Usuários"

        // Observa a lista de usuários e atualiza o Adapter
        viewModel.usuarios.observe(this) { lista ->
            binding.rvUsuarios.adapter = UsuarioAdapter(lista)
        }

        // Busca os usuários na API
        viewModel.carregarUsuarios()
    }
}