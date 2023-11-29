package com.svetinjacodelab.backend.project.selling

import com.svetinjacodelab.backend.project.selling.model.SellingEntity
import org.springframework.data.repository.CrudRepository

interface SellingRepository: CrudRepository<SellingEntity, String> {
}