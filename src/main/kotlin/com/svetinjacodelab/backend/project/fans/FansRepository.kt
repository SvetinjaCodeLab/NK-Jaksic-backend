package com.svetinjacodelab.backend.project.fans

import com.svetinjacodelab.backend.project.fans.model.FansEntity
import org.springframework.data.repository.CrudRepository

interface FansRepository: CrudRepository<FansEntity, Long>