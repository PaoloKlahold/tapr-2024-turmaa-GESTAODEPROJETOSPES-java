package br.univille.microservgestaoprojetospesapplication.services.impl;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.univille.microservgestaoprojetospesapplication.entities.Problem;
import br.univille.microservgestaoprojetospesapplication.repositories.ProblemRepository;



@Service
public class ProblemServiceImpl {

    @Autowired
    private ProblemRepository problemRepository;

    public List<Problem> getAll() {
        var returnIterator = problemRepository.findAll();
        var listProblems = new ArrayList<Problem>();
        returnIterator.forEach(listProblems::add);
        return listProblems;
    }

    public Problem save(Problem problem) {
        return problemRepository.save(problem);
    }

    public Problem update(String cdActivity, Problem problem) {
        var getProblem = problemRepository.findById(cdActivity);

        if(!getProblem.isPresent()) {
            throw new RuntimeException("Problem not found with id: " + cdActivity);
        }

        var oldProblem = getProblem.get();
        oldProblem.setActivityTitle(problem.getActivityTitle());
        oldProblem.setActivitySubs(problem.getActivitySubs());
        oldProblem.setCdCause(problem.getCdCause());
        oldProblem.setCdProject(problem.getCdProject());
        problemRepository.save(oldProblem);
        return oldProblem;
    }

    public Problem delete(String cdActivity) {
        var getProblem = problemRepository.findById(cdActivity);

        if(!getProblem.isPresent()) {
            throw new RuntimeException("Problem not found with id: " + cdActivity);
        }

        var oldProblem = getProblem.get();
        problemRepository.delete(oldProblem);
        return oldProblem;
    }
}