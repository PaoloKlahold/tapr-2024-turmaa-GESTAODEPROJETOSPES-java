package br.univille.microservgestaoprojetospesapplication.services;

import java.util.List;

import br.univille.microservgestaoprojetospesapplication.entities.Course;

public interface CourseService {
    List<Course> getAll();
    Course save(Course course);
    Course update(String cdCourse, Course course);
    Course delete(String cdCourse);
}
