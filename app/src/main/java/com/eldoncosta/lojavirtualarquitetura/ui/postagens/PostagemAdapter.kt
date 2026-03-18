package com.eldoncosta.lojavirtualarquitetura.ui.postagens

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eldoncosta.lojavirtualarquitetura.data.model.Postagem
import com.eldoncosta.lojavirtualarquitetura.databinding.ItemPostagemBinding

class PostagemAdapter(private val lista: List<Postagem>) :
    RecyclerView.Adapter<PostagemAdapter.PostagemViewHolder>() {

    class PostagemViewHolder(val binding: ItemPostagemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostagemViewHolder {
        val binding = ItemPostagemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostagemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostagemViewHolder, position: Int) {
        val postagem = lista[position]
        holder.binding.txtTituloPostagem.text = postagem.title
        holder.binding.txtCorpoPostagem.text = postagem.body

        // Transforma a lista de tags ["tag1", "tag2"] em uma string única: "#tag1 #tag2"
        holder.binding.txtTagsPostagem.text = postagem.tags.joinToString(" ") { "#$it" }
    }

    override fun getItemCount() = lista.size
}
