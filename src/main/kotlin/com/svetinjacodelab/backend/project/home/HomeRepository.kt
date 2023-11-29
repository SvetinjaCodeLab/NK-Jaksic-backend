package com.svetinjacodelab.backend.project.home

import com.svetinjacodelab.backend.project.home.model.HomeEntity
import org.springframework.data.repository.CrudRepository

interface HomeRepository : CrudRepository<HomeEntity, Long>