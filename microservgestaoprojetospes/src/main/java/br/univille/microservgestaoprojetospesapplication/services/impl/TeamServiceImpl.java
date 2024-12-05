package br.univille.microservgestaoprojetospesapplication.services.impl;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.univille.microservgestaoprojetospesapplication.entities.Team;
import br.univille.microservgestaoprojetospesapplication.repositories.TeamRepository;
import br.univille.microservgestaoprojetospesapplication.services.TeamService;





@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public List<Team> getAll() {
        var returnIterator = teamRepository.findAll();
        var listTeams = new ArrayList<Team>();
        returnIterator.forEach(listTeams::add);
        return listTeams;
    }

    @Override
    public Team save(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Team update(String cdTeam, Team team) {
        var getTeam = teamRepository.findById(cdTeam);

        if(!getTeam.isPresent()) {
            throw new RuntimeException("Team not found with id: " + cdTeam);
        }

        var oldTeam = getTeam.get();
        oldTeam.setCdProject(team.getCdProject());
        oldTeam.setCdScholarshipStudent(team.getCdScholarshipStudent());
        
        return teamRepository.save(oldTeam);
    }

    @Override
    public Team delete(String cdTeam) {
        var getTeam = teamRepository.findById(cdTeam);

        if(!getTeam.isPresent()) {
            throw new RuntimeException("Team not found with id: " + cdTeam);
        }

        var oldTeam = getTeam.get();
        teamRepository.delete(oldTeam);
        return oldTeam;
    }
}