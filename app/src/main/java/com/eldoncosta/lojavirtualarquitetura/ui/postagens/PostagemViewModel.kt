package com.eldoncosta.lojavirtualarquitetura.ui.postagens

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eldoncosta.lojavirtualarquitetura.data.model.Postagem
import com.eldoncosta.lojavirtualarquitetura.data.repository.PostagemRepository
import kotlinx.coroutines.launch

class PostagemViewModel : ViewModel() {
    private val repository = PostagemRepository()

    private val _postagens = MutableLiveData<List<Postagem>>()
    val postagens: LiveData<List<Postagem>> = _postagens

    fun carregarPostagens() {
        viewModelScope.launch {
            val lista = repository.buscarPostagens()
            _postagens.value = lista ?: emptyList()
        }
    }
}