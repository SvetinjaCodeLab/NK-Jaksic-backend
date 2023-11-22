package com.svetinjacodelab.backend.project.table

import org.springframework.data.repository.CrudRepository

interface TableRepository: CrudRepository<Table, String> {
}