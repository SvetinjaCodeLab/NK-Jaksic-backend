package com.svetinjacodelab.backend.project.team.model

data class PlayerDto(
    val playerId: Long? = null,
    val firstName: String? = null,
    val lastName: String? = null,
    val dateOfBirth: String? = null,
    val position: String? = null,
    val jerseyNumber: Int? = null,
    val playedGames: Int? = null,
    val playedMinutes: Int? = null,
    val goals: Int? = null,
    val yellowCards: Int? = null,
    val redCards: Int? = null,
    val photoUrl: String? = null,
    val playerDescription: String? = null
)

fun PlayerEntity.toDto() = PlayerDto(
    playerId = this.player_Id,
    firstName = this.firstName,
    lastName = this.lastName,
    dateOfBirth = this.dateOfBirth,
    position = this.position,
    jerseyNumber = this.jerseyNumber,
    playedGames = this.playedGames,
    playedMinutes = this.playedMinutes,
    goals = this.goals,
    yellowCards = this.yellowCards,
    redCards = this.redCards,
    photoUrl = this.photoUrl

)
