package br.univille.microservgestaoprojetospesapplication.services;

import java.util.List;
import br.univille.microservgestaoprojetospesapplication.entities.Problem;

public interface ProblemService
{
    List<Problem> getAll();
    Problem save(Problem problem);
    Problem update(Long id, Problem problem);
    Problem delete(Long id);
}
