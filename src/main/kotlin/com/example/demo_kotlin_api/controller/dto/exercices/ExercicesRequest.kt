package com.example.demo_kotlin_api.controller.dto.exercices

data class ExercicesRequest (
    val name: String,
    val sets: Int,
    val repetitions: Int,
    val weight: Int,
    )