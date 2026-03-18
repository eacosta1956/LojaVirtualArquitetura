package com.eldoncosta.lojavirtualarquitetura.ui.carrinhos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eldoncosta.lojavirtualarquitetura.data.model.Carrinho
import com.eldoncosta.lojavirtualarquitetura.data.repository.CarrinhoRepository
import kotlinx.coroutines.launch

class CarrinhoViewModel : ViewModel() {
    private val repository = CarrinhoRepository()

    private val _carrinhos = MutableLiveData<List<Carrinho>>()
    val carrinhos: LiveData<List<Carrinho>> = _carrinhos

    fun carregarCarrinhos() {
        viewModelScope.launch {
            val lista = repository.buscarCarrinhos()
            _carrinhos.value = lista ?: emptyList()
        }
    }
}