package com.example.nuvcomponent3_7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nuvcomponent3_7.databinding.ItemBinding

class AdaptorKt(
    private var list: List<Madel>, val onClick: (position: Int) -> Unit

) : RecyclerView.Adapter<AdaptorKt.ViewHoldelr>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoldelr {
        return ViewHoldelr(ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
        }

    override fun onBindViewHolder(holder: ViewHoldelr, position: Int) {
       holder.onBind(list[position],position)
    }

    override fun getItemCount() = list.size

    inner class ViewHoldelr(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(madel: Madel, position: Int) {
            itemView.setOnClickListener {
                onClick(position)
            }
            binding.imgIt.setImageResource(madel.image)
            binding.tvName.text = madel.name
            binding.ali.text = madel.alive

        }
    }

}