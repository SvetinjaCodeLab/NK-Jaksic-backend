package com.svetinjacodelab.backend.project.team

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TeamController(val teamService: TeamService) {

    @GetMapping("/")
    fun getAllPlayers() = teamService.getAllPlayers()
}