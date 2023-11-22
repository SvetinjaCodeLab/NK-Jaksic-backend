package com.svetinjacodelab.backend.project.feedback

import org.springframework.data.repository.CrudRepository

interface FeedbackRepository: CrudRepository<Feedback, String> {
}