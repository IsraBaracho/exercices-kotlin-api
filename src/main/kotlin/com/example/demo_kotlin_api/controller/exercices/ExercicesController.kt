package com.example.demo_kotlin_api.controller.exercices

import com.example.demo_kotlin_api.controller.dto.exercices.ExercicesRequest
import com.example.demo_kotlin_api.controller.dto.exercices.ExercicesResponse
import com.example.demo_kotlin_api.controller.dto.exercices.toExercices
import com.example.demo_kotlin_api.controller.dto.exercices.toExercicesResponse
import com.example.demo_kotlin_api.entity.exercices.Exercices
import com.example.demo_kotlin_api.service.exercices.ExerciceService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
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
    suspend fun save(@RequestBody exercice: ExercicesRequest): ExercicesResponse {
        return exerciceService.save(exercice.toExercices()).toExercicesResponse()
    }

    @GetMapping("/all")
    suspend fun findAll(): List<ExercicesResponse> {
        return exerciceService.findAll().map { it.toExercicesResponse() }
    }

    @GetMapping("/id/{id}")
    suspend fun findById(@PathVariable id: Long): ExercicesResponse{
        return exerciceService.findById(id).toExercicesResponse()
    }

    @GetMapping("/name/{name}")
    suspend fun findByName(@PathVariable name: String): List<ExercicesResponse> {
        return exerciceService.findByName(name).map { it.toExercicesResponse() }
    }

}