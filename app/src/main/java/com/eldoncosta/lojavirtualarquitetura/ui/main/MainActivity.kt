package com.eldoncosta.lojavirtualarquitetura.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eldoncosta.lojavirtualarquitetura.databinding.ActivityMainBinding
import com.eldoncosta.lojavirtualarquitetura.ui.carrinhos.CarrinhosActivity
import com.eldoncosta.lojavirtualarquitetura.ui.postagens.PostagensActivity
import com.eldoncosta.lojavirtualarquitetura.ui.produtos.ProdutosActivity
import com.eldoncosta.lojavirtualarquitetura.ui.usuarios.UsuariosActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializa o ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configurarCliques()
    }

    private fun configurarCliques() {
        // Navegação para Produtos
        binding.cardProdutos.setOnClickListener {
            startActivity(Intent(this, ProdutosActivity::class.java))
        }

        // Navegação para Carrinhos
        binding.cardCarrinhos.setOnClickListener {
            startActivity(Intent(this, CarrinhosActivity::class.java))
        }

        // Navegação para Usuários
        binding.cardUsuarios.setOnClickListener {
            startActivity(Intent(this, UsuariosActivity::class.java))
        }

        // Navegação para Postagens
        binding.cardPostagens.setOnClickListener {
            startActivity(Intent(this, PostagensActivity::class.java))
        }
    }
}