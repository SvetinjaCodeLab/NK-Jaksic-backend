package com.svetinjacodelab.backend.project.team

import com.svetinjacodelab.backend.project.team.model.PlayerEntity
import org.springframework.data.repository.CrudRepository

interface TeamRepository: CrudRepository<PlayerEntity, Long>