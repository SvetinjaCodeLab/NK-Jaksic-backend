package com.svetinjacodelab.backend.project.stadium

import org.springframework.data.repository.CrudRepository

interface StadiumRepository: CrudRepository<Stadium, String> {
}