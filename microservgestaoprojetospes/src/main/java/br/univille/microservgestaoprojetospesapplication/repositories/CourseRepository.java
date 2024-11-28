package br.univille.microservgestaoprojetospesapplication.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


import br.univille.microservgestaoprojetospesapplication.entities.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, String> {
    
}
