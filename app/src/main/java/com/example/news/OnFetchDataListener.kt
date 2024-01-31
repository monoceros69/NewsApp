package com.example.news

import com.example.news.models.NewsHeadlines

interface OnFetchDataListener<NewsApiResponse> {
    fun onFetchData(list: List<NewsHeadlines>, message: String?)
    fun onError(message: String?)
}