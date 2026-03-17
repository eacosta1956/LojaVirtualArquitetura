package com.eldoncosta.lojavirtualarquitetura.ui.produtos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eldoncosta.lojavirtualarquitetura.databinding.ActivityProdutosBinding

class ProdutosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProdutosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializando o ViewBinding para esta tela
        binding = ActivityProdutosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configura um título na barra superior para teste
        supportActionBar?.title = "Produtos"
    }
}