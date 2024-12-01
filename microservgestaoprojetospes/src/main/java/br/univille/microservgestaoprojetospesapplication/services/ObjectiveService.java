package br.univille.microservgestaoprojetospesapplication.services;

import java.util.List;


import br.univille.microservgestaoprojetospesapplication.entities.Objective;

public interface ObjectiveService {
    List<Objective> getAll();
    Objective save(Objective objective);
    Objective update(String cdObjective, Objective objective);
    Objective delete(String cdObjective);
}