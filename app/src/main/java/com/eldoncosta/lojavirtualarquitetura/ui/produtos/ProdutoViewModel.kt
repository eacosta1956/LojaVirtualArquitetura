package com.eldoncosta.lojavirtualarquitetura.ui.produtos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eldoncosta.lojavirtualarquitetura.data.model.Produto
import com.eldoncosta.lojavirtualarquitetura.data.repository.ProdutoRepository
import kotlinx.coroutines.launch

class ProdutoViewModel : ViewModel() {
    private val repository = ProdutoRepository()

    // Lista de produtos que a Activity vai observar
    private val _produtos = MutableLiveData<List<Produto>>()
    val produtos: LiveData<List<Produto>> = _produtos

    fun carregarProdutos() {
        viewModelScope.launch {
            val lista = repository.buscarProdutos()
            _produtos.value = lista ?: emptyList()
        }
    }
}