package com.svetinjacodelab.backend.project.message

import org.springframework.stereotype.Service
import kotlin.jvm.optionals.toList

@Service
class MessageService(val database: MessageRepository) {
    fun findMessages(): List<Message> = database.findAll().toList()
    fun findMessageById(id: String): List<Message> = database.findById(id).toList()
    fun save(message: Message) = database.save(message)
}