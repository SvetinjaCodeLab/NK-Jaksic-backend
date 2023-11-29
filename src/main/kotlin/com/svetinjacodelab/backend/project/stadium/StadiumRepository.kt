package com.svetinjacodelab.backend.project.stadium

import com.svetinjacodelab.backend.project.stadium.model.StadiumEntity
import org.springframework.data.repository.CrudRepository

interface StadiumRepository: CrudRepository<StadiumEntity, Long>