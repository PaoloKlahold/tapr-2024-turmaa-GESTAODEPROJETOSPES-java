package br.univille.microservgestaoprojetospesapplication.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservgestaoprojetospesapplication.entities.Course;
import br.univille.microservgestaoprojetospesapplication.entities.Project;
import br.univille.microservgestaoprojetospesapplication.repositories.CourseRepository;
import br.univille.microservgestaoprojetospesapplication.services.CourseService;

@Service
class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public List<Course> getAll() {
        var returnIterator = courseRepository.findAll();
        var listCourses = new ArrayList<Course>();
        returnIterator.forEach(listCourses::add);
        return listCourses;
    }

    public Course createNewCourse(Project project) {
        Course newCourse = new Course();
        return courseRepository.save(newCourse);
    }

    @Override
    public Course save(Course project) {
        return courseRepository.save(project);
    }

    @Override
    public Course update(String cdCourse, Course course) {
        var getCourse = courseRepository.findById(cdCourse);

        if(!getCourse.isPresent()) {
            throw new RuntimeException("Project not found with id: " + cdCourse);
        }

        var oldCourse = getCourse.get();

        oldCourse.setName(course.getName());
        courseRepository.save(oldCourse);
        return oldCourse;
    }

    @Override
    public Course delete(String cdProject) {
        var getCourse = courseRepository.findById(cdProject);

        if(!getCourse.isPresent()) {
            throw new RuntimeException("Project not found with id: " + cdProject);
        }

        var course = getCourse.get();
        courseRepository.delete(course);
        return course;
    }
    
}