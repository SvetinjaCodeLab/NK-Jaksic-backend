package com.svetinjacodelab.backend.project.news.model

import jakarta.persistence.*

@Entity(name = "article")
class ArticleEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "article_id")
    var articleId: Long? = null,
    var title: String? = null,
    var summary: String? = null,
    var content: String? = null,
    var author: String? = null,
    @Column(name = "published_date")
    var publishedDate: String? = null,
    @Column(name = "last_updated")
    var lastUpdated: String? = null,
    var weather: String? = null,
    @Column(name = "photo_url")
    var photoUrl: String? = null,
)

fun ArticleDto.toEntity() = ArticleEntity(
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
