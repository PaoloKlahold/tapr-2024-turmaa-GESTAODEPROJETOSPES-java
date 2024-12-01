package br.univille.microservgestaoprojetospesapplication.services;

import java.util.List;
import br.univille.microservgestaoprojetospesapplication.entities.Cause;


public interface CauseService {
    List<Cause> getAll();
    Cause save(Cause cause);
    Cause delete(Long id);
    Cause update(Long id, Cause cause);
}