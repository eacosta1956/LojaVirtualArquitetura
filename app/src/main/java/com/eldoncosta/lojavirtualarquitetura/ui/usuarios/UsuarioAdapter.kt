package com.eldoncosta.lojavirtualarquitetura.ui.usuarios

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.eldoncosta.lojavirtualarquitetura.data.model.Usuario
import com.eldoncosta.lojavirtualarquitetura.databinding.ItemUsuarioBinding

class UsuarioAdapter(private val lista: List<Usuario>) :
    RecyclerView.Adapter<UsuarioAdapter.UsuarioViewHolder>() {

    class UsuarioViewHolder(val binding: ItemUsuarioBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsuarioViewHolder {
        val binding = ItemUsuarioBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UsuarioViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UsuarioViewHolder, position: Int) {
        val usuario = lista[position]
        holder.binding.txtNomeUsuario.text = "${usuario.firstName} ${usuario.lastName}"
        holder.binding.txtEmailUsuario.text = usuario.email

        // Carregando a foto do usuário com Glide (Agora com tratamento de erro)
        Glide.with(holder.binding.root.context)
            .load(usuario.image)
            .placeholder(android.R.drawable.ic_menu_gallery) // Aparece enquanto carrega
            .error(android.R.drawable.stat_notify_error)    // Aparece se der erro
            .into(holder.binding.imgUsuario)
    }

    override fun getItemCount() = lista.size
}