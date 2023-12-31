package com.svetinjacodelab.backend.project.team

import com.svetinjacodelab.backend.project.team.model.PlayerEntity
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class TeamService(val teamRepository: TeamRepository) {
    fun getAllPlayers() = teamRepository.findAll().toList()
    fun getPlayerById(id: Long) = teamRepository.findByIdOrNull(id = id)
    fun savePlayer(player: PlayerEntity) = teamRepository.save(player)
}