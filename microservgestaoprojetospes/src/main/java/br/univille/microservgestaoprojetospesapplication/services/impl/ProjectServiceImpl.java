package br.univille.microservgestaoprojetospesapplication.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservgestaoprojetospesapplication.entities.Objective;
import br.univille.microservgestaoprojetospesapplication.entities.Problem;
import br.univille.microservgestaoprojetospesapplication.entities.Project;
import br.univille.microservgestaoprojetospesapplication.entities.Team;
import br.univille.microservgestaoprojetospesapplication.repositories.ProjectRepository;
import br.univille.microservgestaoprojetospesapplication.services.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService
{
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getAll()
    {
        var returnIterator = projectRepository.findAll();
        var listProjects = new ArrayList<Project>();
        returnIterator.forEach(listProjects::add);
        return listProjects;
    }

    public Project createNewProject(Team team, Objective objective, Problem problem) {
        Project newProject = new Project();
        // newProject.setCdTeam(team);
        // newProject.setCdObjective(objective);
        // newProject.setCdProblem(problem);
        return projectRepository.save(newProject);
    }

    @Override
    public Project save(Project project)
    {
        return projectRepository.save(project);
    }

    @Override
    public Project update(String cdProject, Project project)
    {
        var getProject = projectRepository.findById(cdProject);

        if(!getProject.isPresent()) {
            throw new RuntimeException("Project not found with id: " + cdProject);
        }

        var oldProject = getProject.get();

        oldProject.setTitle(project.getTitle());
        projectRepository.save(oldProject);
        return oldProject;
    }

    @Override
    public Project delete(String cdProject)
    {
        var getProject = projectRepository.findById(cdProject);

        if(!getProject.isPresent()) {
            throw new RuntimeException("Project not found with id: " + cdProject);
        }

        var oldProject = getProject.get();
        projectRepository.delete(oldProject);
        return oldProject;
    }

    // @Override
    // public Project getByCd(String cdProject)
    // {
    //     var project = projectRepository.findById(cdProject);
    //     if(project.isPresent()) return project.get();
    //     return null;
    // }

    // @Override
    // public Project update(String cdProject, Project Project)
    // {
    //     var searchOldProject = projectRepository.findById(cdProject);
    //     if (searchOldProject.isPresent()) {
    //         var oldProject = searchOldProject.get();

    //         oldProject.setNome(project.getNome());
    //         oldProject.setEndereco(project.getEndereco());

    //         return repository.save(oldProject);
    //     }

    //     return null;
    // }

}