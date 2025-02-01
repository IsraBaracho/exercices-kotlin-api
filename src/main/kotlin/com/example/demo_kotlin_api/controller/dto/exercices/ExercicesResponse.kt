package com.example.demo_kotlin_api.controller.dto.exercices

data class ExercicesResponse (
    val id: Long,
    val name: String,
    val sets: Int,
    val repetitions: Int,
    val weight: Int,
)