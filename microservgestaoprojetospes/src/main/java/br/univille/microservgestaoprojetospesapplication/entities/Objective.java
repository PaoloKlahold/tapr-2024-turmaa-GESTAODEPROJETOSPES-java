package br.univille.microservgestaoprojetospesapplication.entities;


import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "objective", autoCreateContainer = true, ru = "400")
public class Objective
{
    @Id
    @PartitionKey
    @GeneratedValue
    private String cdObjective;

    private String objectiveTitle;
    private String objectiveSubs;
    private String cdProject;

    public String getCdObjective() {
        return cdObjective;
    }

    public void setCdObjective(String cdObjective) {
        this.cdObjective = cdObjective;
    }

    public String getObjectiveTitle() {
        return objectiveTitle;
    }

    public void setObjectiveTitle(String objectiveTitle) {
        this.objectiveTitle = objectiveTitle;
    }

    public String getObjectiveSubs() {
        return objectiveSubs;
    }

    public void setObjectiveSubs(String objectiveSubs) {
        this.objectiveSubs = objectiveSubs;
    }

    public String getCdProject() {
        return cdProject;
    }

    public void setCdProject(String cdProject) {
        this.cdProject = cdProject;
    }
}