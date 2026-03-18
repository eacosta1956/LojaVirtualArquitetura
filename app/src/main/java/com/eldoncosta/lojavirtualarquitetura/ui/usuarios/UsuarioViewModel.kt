package com.eldoncosta.lojavirtualarquitetura.ui.usuarios

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eldoncosta.lojavirtualarquitetura.data.model.Usuario
import com.eldoncosta.lojavirtualarquitetura.data.repository.UsuarioRepository
import kotlinx.coroutines.launch

class UsuarioViewModel : ViewModel() {
    private val repository = UsuarioRepository()

    private val _usuarios = MutableLiveData<List<Usuario>>()
    val usuarios: LiveData<List<Usuario>> = _usuarios

    fun carregarUsuarios() {
        viewModelScope.launch {
            val lista = repository.buscarUsuarios()
            _usuarios.value = lista ?: emptyList()
        }
    }
}