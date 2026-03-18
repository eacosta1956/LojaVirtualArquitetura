package com.eldoncosta.lojavirtualarquitetura.ui.carrinhos

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.eldoncosta.lojavirtualarquitetura.databinding.ActivityCarrinhosBinding

class CarrinhosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCarrinhosBinding
    private val viewModel: CarrinhoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializando o ViewBinding para esta tela
        binding = ActivityCarrinhosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configura um título na barra superior para teste
        supportActionBar?.title = "Carrinhos"

        // Observa a lista de carrinhos vinda do ViewModel
        viewModel.carrinhos.observe(this) { lista ->
            binding.rvCarrinhos.adapter = CarrinhoAdapter(lista)
        }

        // Inicia a busca dos dados na API
        viewModel.carregarCarrinhos()
    }
}