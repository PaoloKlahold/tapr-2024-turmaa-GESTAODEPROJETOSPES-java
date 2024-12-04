package br.univille.microservgestaoprojetospesapplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservgestaoprojetospesapplication.entities.Teacher;

@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherAPIController extends GenericAPIController<Teacher> 
{
    
}