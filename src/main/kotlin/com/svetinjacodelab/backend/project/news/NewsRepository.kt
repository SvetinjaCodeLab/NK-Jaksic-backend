package com.svetinjacodelab.backend.project.news

import com.svetinjacodelab.backend.project.news.model.ArticleEntity
import org.springframework.data.repository.CrudRepository

interface NewsRepository : CrudRepository<ArticleEntity, Long>