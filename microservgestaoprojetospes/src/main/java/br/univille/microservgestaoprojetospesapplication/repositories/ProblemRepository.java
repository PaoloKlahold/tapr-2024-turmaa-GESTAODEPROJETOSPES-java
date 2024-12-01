package br.univille.microservgestaoprojetospesapplication.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservgestaoprojetospesapplication.entities.Problem;



@Repository
public interface ProblemRepository extends CrudRepository<Problem, String> {

}