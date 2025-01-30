package com.example.demo_kotlin_api.controller.exercices

import com.example.demo_kotlin_api.entity.exercices.Exercices
import com.example.demo_kotlin_api.service.exercices.ExerciceService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/api/exercices")
class ExercicesController(
    private val exerciceService: ExerciceService
) {
    @PostMapping("/new")
    suspend fun save(@RequestBody exercice: Exercices): Exercices {
        return exerciceService.save(exercice)
    }

}