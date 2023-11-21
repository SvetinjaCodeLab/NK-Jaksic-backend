package com.svetinjacodelab.backend.project.repository

import com.svetinjacodelab.backend.project.model.Message
import org.springframework.data.repository.CrudRepository

interface MessageRepository: CrudRepository<Message, String> {
}
