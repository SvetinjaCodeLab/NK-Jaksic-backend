package com.svetinjacodelab.backend.project.table

import com.svetinjacodelab.backend.project.table.model.TableEntity
import org.springframework.data.repository.CrudRepository

interface TableRepository: CrudRepository<TableEntity, Long>