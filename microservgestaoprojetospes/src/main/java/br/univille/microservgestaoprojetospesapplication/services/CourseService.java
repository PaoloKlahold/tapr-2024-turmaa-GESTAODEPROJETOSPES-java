package br.univille.microservgestaoprojetospesapplication.services;

import java.util.List;

import br.univille.microservgestaoprojetospesapplication.entities.Course;

public interface CourseService {
    List<Course> getAll();
    Course save(Course project);
    Course update(String cdProject, Course project);
    Course delete(String cdProject);
}
