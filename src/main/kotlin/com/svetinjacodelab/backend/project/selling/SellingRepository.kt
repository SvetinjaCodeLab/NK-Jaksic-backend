package com.svetinjacodelab.backend.project.selling

import org.springframework.data.repository.CrudRepository

interface SellingRepository: CrudRepository<Selling, String> {
}