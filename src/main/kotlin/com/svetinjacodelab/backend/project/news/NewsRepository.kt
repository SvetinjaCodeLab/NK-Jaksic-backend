package com.svetinjacodelab.backend.project.news

import com.svetinjacodelab.backend.project.news.model.NewsEntity
import org.springframework.data.repository.CrudRepository

interface NewsRepository : CrudRepository<NewsEntity, Long>