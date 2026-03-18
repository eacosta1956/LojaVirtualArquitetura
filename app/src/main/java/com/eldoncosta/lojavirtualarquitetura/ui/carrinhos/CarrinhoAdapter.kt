package com.eldoncosta.lojavirtualarquitetura.ui.carrinhos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eldoncosta.lojavirtualarquitetura.data.model.Carrinho
import com.eldoncosta.lojavirtualarquitetura.databinding.ItemCarrinhoBinding

class CarrinhoAdapter(private val lista: List<Carrinho>) :
    RecyclerView.Adapter<CarrinhoAdapter.CarrinhoViewHolder>() {

    class CarrinhoViewHolder(val binding: ItemCarrinhoBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarrinhoViewHolder {
        val binding = ItemCarrinhoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CarrinhoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CarrinhoViewHolder, position: Int) {
        val carrinho = lista[position]
        holder.binding.txtIdCarrinho.text = "Carrinho #${carrinho.id}"
        holder.binding.txtQtdProdutos.text = "${carrinho.totalProducts} produtos"
        holder.binding.txtTotalCarrinho.text = "Total: U$ ${carrinho.total}"
    }

    override fun getItemCount() = lista.size
}