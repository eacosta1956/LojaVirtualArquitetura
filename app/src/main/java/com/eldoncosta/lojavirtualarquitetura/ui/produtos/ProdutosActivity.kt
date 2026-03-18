package com.eldoncosta.lojavirtualarquitetura.ui.produtos

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.eldoncosta.lojavirtualarquitetura.databinding.ActivityProdutosBinding

class ProdutosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProdutosBinding
    private val viewModel: ProdutoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProdutosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Lista de Produtos"

        // Observa os dados do ViewModel
        viewModel.produtos.observe(this) { lista ->
            binding.rvProdutos.adapter = ProdutoAdapter(lista)
        }

        // Chama a carga de dados
        viewModel.carregarProdutos()
    }
}