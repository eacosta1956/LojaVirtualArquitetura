package com.eldoncosta.lojavirtualarquitetura

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eldoncosta.lojavirtualarquitetura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // 1. Declarar a variável do Binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 2. Inicializar o Binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        // 3. Definir o conteúdo da tela como a raiz (root) do binding
        setContentView(binding.root)
    }
}