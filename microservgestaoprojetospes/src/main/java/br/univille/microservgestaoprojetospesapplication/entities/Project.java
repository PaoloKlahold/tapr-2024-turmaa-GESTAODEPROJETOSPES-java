package br.univille.microservgestaoprojetospesapplication.entities;


import br.univille.microservgestaoprojetospesapplication.enums.statusEnum;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "project", autoCreateContainer = true)
public class Project
{
    @Id
    @PartitionKey
    @GeneratedValue
    private String cdProject;

    private String projectTitle;
    private String projectSubs;
    private statusEnum status;
    private String cdTeam;
    private String cdCourse;
    private String cdProblem;
    private String cdObjective;
    private String cdActivity;

    public String getCdProject() {
        return cdProject;
    }

    public void setCdProject(String cdProject) {
        this.cdProject = cdProject;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectSubs() {
        return projectSubs;
    }

    public void setProjectSubs(String projectSubs) {
        this.projectSubs = projectSubs;
    }

    public statusEnum getStatus() {
        return status;
    }

    public void setStatus(statusEnum status) {
        this.status = status;
    }

    public String getCdTeam() {
        return cdTeam;
    }

    public void setCdTeam(String cdTeam) {
        this.cdTeam = cdTeam;
    }

    public String getCdCourse() {
        return cdCourse;
    }

    public void setCdCourse(String cdCourse) {
        this.cdCourse = cdCourse;
    }

    public String getCdProblem() {
        return cdProblem;
    }

    public void setCdProblem(String cdProblem) {
        this.cdProblem = cdProblem;
    }

    public String getCdObjective() {
        return cdObjective;
    }

    public void setCdObjective(String cdObjective) {
        this.cdObjective = cdObjective;
    }

    public String getCdActivity() {
        return cdActivity;
    }

    public void setCdActivity(String cdActivity) {
        this.cdActivity = cdActivity;
    }
}