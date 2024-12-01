
package br.univille.microservgestaoprojetospesapplication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservgestaoprojetospesapplication.entities.Activity;

@Repository
public interface ActivityRepository extends CrudRepository<Activity, String>
{

}