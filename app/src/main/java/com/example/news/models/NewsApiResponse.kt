package com.example.news.models

import java.io.Serializable

class NewsApiResponse : Serializable {
    var status: String? = null
    var totalResults = 0
    @JvmField
    var articles: List<NewsHeadlines>? = null
}