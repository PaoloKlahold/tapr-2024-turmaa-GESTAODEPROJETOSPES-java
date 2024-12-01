package br.univille.microservgestaoprojetospesapplication.services.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.univille.microservgestaoprojetospesapplication.entities.Activity;
import br.univille.microservgestaoprojetospesapplication.entities.Objective;
import br.univille.microservgestaoprojetospesapplication.entities.Problem;
import br.univille.microservgestaoprojetospesapplication.entities.Project;
import br.univille.microservgestaoprojetospesapplication.entities.Team;
import br.univille.microservgestaoprojetospesapplication.repositories.ActivityRepository;
import br.univille.microservgestaoprojetospesapplication.repositories.ObjectiveRepository;
import br.univille.microservgestaoprojetospesapplication.repositories.ProjectRepository;


public class ObjectiveServiceImpl {

    @Autowired
    private ObjectiveRepository objectiveRepository;

    public List<Objective> getAll() {
        var returnIterator = objectiveRepository.findAll();
        var listObjectives = new ArrayList<Objective>();
        returnIterator.forEach(listObjectives::add);
        return listObjectives;
    }

    public Objective save(Objective objective) {
        return objectiveRepository.save(objective);
    }

    public Objective update(String cdObjective, Objective objective) {
        var getObjective = objectiveRepository.findById(cdObjective);

        if(!getObjective.isPresent()) {
            throw new RuntimeException("Objective not found with id: " + cdObjective);
        }

        var oldObjective = getObjective.get();
        oldObjective.setObjectiveTitle(objective.getObjectiveTitle());
        oldObjective.setObjectiveSubs(objective.getObjectiveSubs());
        oldObjective.setCdProject(objective.getCdProject());
        objectiveRepository.save(oldObjective);
        return oldObjective;
    }

    public Objective delete(String cdObjective) {
        var getObjective = objectiveRepository.findById(cdObjective);

        if(!getObjective.isPresent()) {
            throw new RuntimeException("Objective not found with id: " + cdObjective);
        }

        var oldObjective = getObjective.get();
        objectiveRepository.delete(oldObjective);
        return oldObjective;
    }
    
}
