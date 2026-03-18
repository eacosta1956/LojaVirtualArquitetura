package com.eldoncosta.lojavirtualarquitetura.ui.produtos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eldoncosta.lojavirtualarquitetura.data.model.Produto
import com.eldoncosta.lojavirtualarquitetura.databinding.ItemProdutoBinding
import com.bumptech.glide.Glide

class ProdutoAdapter(private val lista: List<Produto>) :
    RecyclerView.Adapter<ProdutoAdapter.ProdutoViewHolder>() {

    class ProdutoViewHolder(val binding: ItemProdutoBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val binding = ItemProdutoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProdutoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        val produto = lista[position]
        holder.binding.txtNomeProduto.text = produto.title
        holder.binding.txtPrecoProduto.text = "U$ ${produto.price}"
        Glide.with(holder.binding.root.context)
            .load(produto.thumbnail)
            .into(holder.binding.imgProduto)
    }

    override fun getItemCount() = lista.size
}