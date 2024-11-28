package br.univille.microservgestaoprojetospesapplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservgestaoprojetospesapplication.entities.Course;
import br.univille.microservgestaoprojetospesapplication.entities.Project;
import br.univille.microservgestaoprojetospesapplication.services.CourseService;
import br.univille.microservgestaoprojetospesapplication.services.ProjectService;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public ResponseEntity<List<Course>> get() {
        return new ResponseEntity<>(courseService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<Course> post(@RequestBody Course course) {
        if(course == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        var courseSaved = courseService.save(course);
        return new ResponseEntity<>(courseSaved, HttpStatus.OK);
    }

    @PutMapping("/{cdCourse}")
    public ResponseEntity<Course> put(@PathVariable("cdCourse") String cdCourse, @RequestBody Course course)
    {
        if(course == null || cdCourse == null || cdCourse == "") {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        course = courseService.update(cdCourse, course);
        if (course == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    @DeleteMapping("/{cdProject}")
    public ResponseEntity<Course> put(@PathVariable("cdProject") String cdProject)
    {
        if(cdProject == null || cdProject == "") {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        var project = courseService.delete(cdProject);
        return new ResponseEntity<>(project, HttpStatus.OK);
    }

}
