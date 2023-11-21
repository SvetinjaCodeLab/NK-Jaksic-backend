package com.svetinjacodelab.backend.project.service

import com.svetinjacodelab.backend.project.model.Message
import com.svetinjacodelab.backend.project.repository.MessageRepository
import org.springframework.jdbc.core.query
import org.springframework.stereotype.Service
import java.util.*
import kotlin.jvm.optionals.toList

@Service
class MessageService(val database: MessageRepository) {
    fun findMessages(): List<Message> = database.findAll().toList()
    fun findMessageById(id: String): List<Message> = database.findById(id).toList()
    fun save(message: Message) = database.save(message)
}