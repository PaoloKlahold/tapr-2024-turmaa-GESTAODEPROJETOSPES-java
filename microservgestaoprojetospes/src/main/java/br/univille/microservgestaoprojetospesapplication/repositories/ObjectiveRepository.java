package br.univille.microservgestaoprojetospesapplication.repositories;


import br.univille.microservgestaoprojetospesapplication.entities.Objective;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ObjectiveRepository extends CrudRepository<Objective, String> {
    // Basic CRUD operations are automatically provided by JpaRepository
    // You can add custom query methods here if needed
}