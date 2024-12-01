package br.univille.microservgestaoprojetospesapplication.services;

import java.util.List;
import br.univille.microservgestaoprojetospesapplication.entities.Team;

public interface TeamService {

    public List<Team> getAll();
    public Team save(Team team);
    public Team update(String cdTeam, Team team);
    public Team delete(String cdTeam);


    
}
