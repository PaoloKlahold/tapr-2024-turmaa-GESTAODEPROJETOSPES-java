package br.univille.microservgestaoprojetospesapplication.entities;


import br.univille.microservgestaoprojetospesapplication.enums.statusEnum;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "project", autoCreateContainer = true, ru = "400")
public class Project
{
    @Id
    @PartitionKey
    @GeneratedValue
    private String cdProject;

    private String title;
    private String desc;
    private statusEnum status;

    private Team team;
    private Problem problem;
    private Objective objective;
    private Activity activity;
    private Cause cause;
    private Course course;

    public Project() {
        this.cdProject = UUID.randomUUID().toString();
    }

    public String getCdProject() {
        return cdProject;
    }
    public void setCdProject(String cdProject) {
        this.cdProject = cdProject;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public statusEnum getStatus() {
        return status;
    }
    public void setStatus(statusEnum status) {
        this.status = status;
    }
    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }
    public Problem getProblem() {
        return problem;
    }
    public void setProblem(Problem problem) {
        this.problem = problem;
    }
    public Objective getObjective() {
        return objective;
    }
    public void setObjective(Objective objective) {
        this.objective = objective;
    }
    public Activity getActivity() {
        return activity;
    }
    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public Cause getCause() {
        return cause;
    }
    public void setCause(Cause cause) {
        this.cause = cause;
    }
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }

    


}