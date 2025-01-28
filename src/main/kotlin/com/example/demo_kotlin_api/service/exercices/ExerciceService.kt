package com.example.demo_kotlin_api.service.exercices

import com.example.demo_kotlin_api.repository.exercices.ExercicesRepository
import org.springframework.stereotype.Service

@Service
class ExerciceService(
    private val exercicesRepository: ExercicesRepository
) {

}