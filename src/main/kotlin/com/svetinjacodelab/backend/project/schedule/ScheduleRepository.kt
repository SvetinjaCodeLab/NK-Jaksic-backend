package com.svetinjacodelab.backend.project.schedule

import org.springframework.data.repository.CrudRepository

interface ScheduleRepository: CrudRepository<Schedule, String> {
}