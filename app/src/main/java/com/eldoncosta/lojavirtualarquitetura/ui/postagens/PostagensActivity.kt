package com.eldoncosta.lojavirtualarquitetura.ui.postagens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eldoncosta.lojavirtualarquitetura.databinding.ActivityPostagensBinding

class PostagensActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPostagensBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializando o ViewBinding para esta tela
        binding = ActivityPostagensBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configura um título na barra superior para teste
        supportActionBar?.title = "Postagens"
    }
}