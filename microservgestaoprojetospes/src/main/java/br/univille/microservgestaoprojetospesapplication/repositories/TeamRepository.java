package br.univille.microservgestaoprojetospesapplication.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.univille.microservgestaoprojetospesapplication.entities.Team;



@Repository
public interface TeamRepository extends CrudRepository<Team, String> {
    
}