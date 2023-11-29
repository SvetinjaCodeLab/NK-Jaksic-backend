package com.svetinjacodelab.backend.project.feedback

import com.svetinjacodelab.backend.project.feedback.model.FeedbackEntity
import org.springframework.data.repository.CrudRepository

interface FeedbackRepository: CrudRepository<FeedbackEntity, Long>