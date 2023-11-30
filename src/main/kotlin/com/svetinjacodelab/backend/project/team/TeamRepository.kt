package com.svetinjacodelab.backend.project.team

import com.svetinjacodelab.backend.project.team.model.TeamEntity
import org.springframework.data.repository.CrudRepository

interface TeamRepository: CrudRepository<TeamEntity, Long>