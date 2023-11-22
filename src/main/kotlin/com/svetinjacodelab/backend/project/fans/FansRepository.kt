package com.svetinjacodelab.backend.project.fans

import org.springframework.data.repository.CrudRepository

interface FansRepository: CrudRepository<Fans, String> {
}