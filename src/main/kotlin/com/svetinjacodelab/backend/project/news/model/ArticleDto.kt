package com.svetinjacodelab.backend.project.news.model

data class ArticleDto(
    val articleId: Long? = null,
    val title: String? = null,
    val summary: String? = null,
    val content: String? = null,
    val author: String? = null,
    val publishedDate: String? = null,
    val lastUpdated: String? = null,
    val weather: String? = null,
    val photoUrl: String? = null,
)

fun ArticleEntity.toDto() = ArticleDto(
    articleId = articleId,
    title = title,
    summary = summary,
    content = content,
    author = author,
    publishedDate = publishedDate,
    lastUpdated = lastUpdated,
    weather = weather,
    photoUrl = photoUrl
)
