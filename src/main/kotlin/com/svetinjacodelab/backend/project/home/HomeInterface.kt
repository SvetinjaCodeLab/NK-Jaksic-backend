package com.svetinjacodelab.backend.project.home

import org.springframework.data.repository.CrudRepository

interface HomeInterface: CrudRepository<Home, String> {
}