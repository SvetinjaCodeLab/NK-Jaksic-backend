package com.svetinjacodelab.backend.project.news

import org.springframework.data.repository.CrudRepository

interface NewsRepository: CrudRepository<News, String> {
}