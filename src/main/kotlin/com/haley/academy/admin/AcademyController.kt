package com.haley.academy.admin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AcademyController {
    @GetMapping("/")
    fun index(): String {
        return "첫 화면이다."
    }
}