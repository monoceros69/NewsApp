package com.example.news

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.news.models.NewsHeadlines
import com.squareup.picasso.Picasso

class DetailsActivity : AppCompatActivity() {
    var headlines: NewsHeadlines? = null
    lateinit var txt_title: TextView
    lateinit var txt_author: TextView
    lateinit var txt_time: TextView
    lateinit var txt_detail: TextView
    lateinit var txt_content: TextView
    lateinit var img_news: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        txt_title = findViewById(R.id.text_detail_title)
        txt_author = findViewById(R.id.text_detail_author)
        txt_time = findViewById(R.id.text_detail_time)
        txt_detail = findViewById(R.id.text_detail_detail)
        txt_content = findViewById(R.id.text_detail_content)
        img_news = findViewById(R.id.img_detail_news)

        headlines = intent.getSerializableExtra("data") as NewsHeadlines?

        txt_title.text = headlines?.title
        txt_author.text = headlines?.author
        txt_time.text = headlines?.publishedAt
        txt_detail.text= headlines?.description
        txt_content.text = headlines?.content
        Picasso.get().load(headlines?.urlToImage).into(img_news)
    }
}