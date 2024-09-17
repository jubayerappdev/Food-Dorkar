package com.mehedi.fooddorkar.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mehedi.fooddorkar.databinding.PopularItemBinding

class PopularAdapter (private val items:List<String>, private val price:List<String>, private val image:List<Int>) : RecyclerView.Adapter<PopularAdapter.PopulerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopulerViewHolder {
        return PopulerViewHolder(PopularItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }



    override fun onBindViewHolder(holder: PopulerViewHolder, position: Int) {
        val item = items[position]
        val image = image[position]
        val price = price[position]
        holder.bind(item,image,price)
    }
    override fun getItemCount(): Int {
        return items.size
    }
    class PopulerViewHolder(private val binding: PopularItemBinding) : RecyclerView.ViewHolder(binding.root) {
        private val imageView = binding.popularFoodImage
        fun bind(item: String, image: Int, price: String) {
            binding.foodNamePopular.text = item
            binding.pricePopular.text = price
            imageView.setImageResource(image)
        }

    }
}