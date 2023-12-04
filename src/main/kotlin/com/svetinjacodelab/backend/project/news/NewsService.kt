package com.svetinjacodelab.backend.project.news

import org.springframework.stereotype.Service

@Service
class NewsService(val newsRepository: NewsRepository) {
    fun getAllArticles() = newsRepository.findAll().toList()
}