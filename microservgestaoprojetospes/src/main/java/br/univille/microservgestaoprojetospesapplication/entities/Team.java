package br.univille.microservgestaoprojetospesapplication.entities;


import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "team", autoCreateContainer = true)
public class Team {

    @Id
    @PartitionKey
    @GeneratedValue
    private String cdTeam;

    private String cdProject;
    private String cdScholarshipStudent;

    public String getCdTeam() {
        return cdTeam;
    }

    public void setCdTeam(String cdTeam) {
        this.cdTeam = cdTeam;
    }

    public String getCdProject() {
        return cdProject;
    }

    public void setCdProject(String cdProject) {
        this.cdProject = cdProject;
    }

    public String getCdScholarshipStudent() {
        return cdScholarshipStudent;
    }

    public void setCdScholarshipStudent(String cdScholarshipStudent) {
        this.cdScholarshipStudent = cdScholarshipStudent;
    }
}