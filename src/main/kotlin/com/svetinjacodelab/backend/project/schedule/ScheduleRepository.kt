package com.svetinjacodelab.backend.project.schedule

import com.svetinjacodelab.backend.project.schedule.model.ScheduleEntity
import org.springframework.data.repository.CrudRepository

interface ScheduleRepository : CrudRepository<ScheduleEntity, Long>