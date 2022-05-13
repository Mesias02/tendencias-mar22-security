package com.empresa.security.controller

import com.empresa.security.model.User
import com.empresa.security.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping
    fun login():ResponseEntity<*>{

        return userService.list()?.let {
            ResponseEntity(it, HttpStatus.OK)
            } ?: ResponseEntity<User>( HttpStatus.NOT_FOUND)
    }
}