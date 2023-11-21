package com.svetinjacodelab.backend.project.controller

import com.svetinjacodelab.backend.project.model.Message
import com.svetinjacodelab.backend.project.service.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(val service: MessageService) {
    @GetMapping("/")
    fun index() = service.findMessages()

    @GetMapping("/{id}")
    fun index(@PathVariable id: String): List<Message> = service.findMessageById(id = id)

    @PostMapping("/")
    fun post(@RequestBody message: Message) = service.save(message)
}
