package com.svetinjacodelab.backend.project.message

import org.springframework.data.repository.CrudRepository

interface MessageRepository: CrudRepository<Message, String> {
}
