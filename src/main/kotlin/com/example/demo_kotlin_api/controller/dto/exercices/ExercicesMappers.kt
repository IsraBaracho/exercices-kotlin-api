package com.example.demo_kotlin_api.controller.dto.exercices

import com.example.demo_kotlin_api.entity.exercices.Exercices

fun ExercicesRequest.toExercices(): Exercices {
    return Exercices(
        name = this.name,
        sets = this.sets,
        repetitions = this.repetitions,
        weight = this.weight

    )
}

fun Exercices.toExercicesResponse(): ExercicesResponse {
    return ExercicesResponse(
        id = this.id ?: 0,
        name = this.name,
        sets = this.sets,
        repetitions = this.repetitions,
        weight = this.weight
    )
}