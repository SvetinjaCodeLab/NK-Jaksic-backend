package com.svetinjacodelab.backend.project.team

import org.springframework.data.repository.CrudRepository

interface TeamRepository: CrudRepository<Team, String> {
}