package com.example.news

import com.example.news.models.NewsHeadlines

interface SelectListener {
    fun OnNewsClicked(headlines: NewsHeadlines?)
}