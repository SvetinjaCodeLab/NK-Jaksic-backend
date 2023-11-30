package com.svetinjacodelab.backend.project.team.model

import jakarta.persistence.*

@Entity(name = "player")
class TeamEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "player_id")
    var playerId: Long? = null,
    @Column(name = "first_name")
    var firstName: String? = null,
    @Column(name = "last_name")
    var lastName: String? = null,
    @Column(name = "date_of_birth")
    var dateOfBirth: String? = null,
    @Column(name = "position")
    var position: String? = null,
    @Column(name = "jersey_number")
    var jerseyNumber: Int? = null,
    @Column(name = "played_games")
    var playedGames: Int? = null,
    @Column(name = "played_minutes")
    var playedMinutes: Int? = null,
    @Column(name = "goals")
    var goals: Int? = null,
    @Column(name = "yellow_cards")
    var yellowCards: Int? = null,
    @Column(name = "red_cards")
    var redCards: Int? = null,
    @Column(name = "photo_url")
    var photoUrl: String? = null,
    @Column(name = "played_description")
    var playerDescription: String? = null
)

fun TeamDto.toEntity() = TeamEntity(
    playerId = this.playerId,
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
    photoUrl = this.photoUrl,
    playerDescription = this.playerDescription
)
