package com.svetinjacodelab.backend.project.news

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NewsController(val newsService: NewsService) {

    @GetMapping("/articles")
    fun getAllArticles() = newsService.getAllArticles()
}