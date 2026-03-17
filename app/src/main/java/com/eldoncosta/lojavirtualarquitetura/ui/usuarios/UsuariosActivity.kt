package com.eldoncosta.lojavirtualarquitetura.ui.usuarios

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eldoncosta.lojavirtualarquitetura.databinding.ActivityUsuariosBinding

class UsuariosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUsuariosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializando o ViewBinding para esta tela
        binding = ActivityUsuariosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configura um título na barra superior para teste
        supportActionBar?.title = "Usuários"
    }
}