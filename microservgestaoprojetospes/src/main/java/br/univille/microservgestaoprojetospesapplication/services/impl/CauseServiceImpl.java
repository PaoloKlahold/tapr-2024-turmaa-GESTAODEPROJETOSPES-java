package br.univille.microservgestaoprojetospesapplication.services.impl;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.univille.microservgestaoprojetospesapplication.entities.Activity;
import br.univille.microservgestaoprojetospesapplication.entities.Cause;
import br.univille.microservgestaoprojetospesapplication.entities.Objective;
import br.univille.microservgestaoprojetospesapplication.entities.Problem;
import br.univille.microservgestaoprojetospesapplication.entities.Project;
import br.univille.microservgestaoprojetospesapplication.entities.Team;
import br.univille.microservgestaoprojetospesapplication.repositories.ActivityRepository;
import br.univille.microservgestaoprojetospesapplication.repositories.CauseRepository;
import br.univille.microservgestaoprojetospesapplication.repositories.ProjectRepository;

public class CauseServiceImpl {

    @Autowired
    private CauseRepository causeRepository;

    public List<Cause> getAll() {
        var returnIterator = causeRepository.findAll();
        var listCauses = new ArrayList<Cause>();
        returnIterator.forEach(listCauses::add);
        return listCauses;
    }

    public Cause save(Cause cause) {
        return causeRepository.save(cause);
    }

    public Cause update(String cdCause, Cause cause) {
        var getCause = causeRepository.findById(cdCause);

        if(!getCause.isPresent()) {
            throw new RuntimeException("Cause not found with id: " + cdCause);
        }

        var oldCause = getCause.get();
        oldCause.setCauseTitle(cause.getCauseTitle());
        oldCause.setCauseSubs(cause.getCauseSubs());
        oldCause.setCdProblem(cause.getCdProblem());
        causeRepository.save(oldCause);
        return oldCause;
    }

    public Cause delete(String cdCause) {
        var getCause = causeRepository.findById(cdCause);

        if(!getCause.isPresent()) {
            throw new RuntimeException("Cause not found with id: " + cdCause);
        }

        var oldCause = getCause.get();
        causeRepository.delete(oldCause);
        return oldCause;
    }


    

}
