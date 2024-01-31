package com.example.news

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.news.models.NewsHeadlines
import com.squareup.picasso.Picasso

class CustomAdapter(
    private val context: Context,
    private val headlines: List<NewsHeadlines>,
    private val listener: SelectListener
) : RecyclerView.Adapter<CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(
            LayoutInflater.from(context).inflate(R.layout.headline_list_items, parent, false)
        )
    }

    override fun onBindViewHolder(
        holder: CustomViewHolder,
        @SuppressLint("RecyclerView") position: Int
    ) {
        holder.text_title.text = headlines[position].title
        holder.text_source.text = headlines[position].source?.name.orEmpty()
        if (headlines[position].urlToImage != null) {
            Picasso.get().load(headlines[position].urlToImage).into(holder.img_headline)
        }
        holder.cardView.setOnClickListener {
            listener.OnNewsClicked(
                headlines[position]
            )
        }
    }

    override fun getItemCount(): Int {
        return headlines.size
    }
}