package br.univille.microservgestaoprojetospesapplication.entities;

import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "problem", autoCreateContainer = true, ru = "400")
public class Problem
{
    @Id
    @PartitionKey
    @GeneratedValue
    private String cdActivity;

    private String activityTitle;
    private String activitySubs;
    private String cdCause;
    private String cdProject;

    public String getCdActivity() {
        return cdActivity;
    }

    public void setCdActivity(String cdActivity) {
        this.cdActivity = cdActivity;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public String getActivitySubs() {
        return activitySubs;
    }

    public void setActivitySubs(String activitySubs) {
        this.activitySubs = activitySubs;
    }

    public String getCdCause() {
        return cdCause;
    }

    public void setCdCause(String cdCause) {
        this.cdCause = cdCause;
    }

    public String getCdProject() {
        return cdProject;
    }

    public void setCdProject(String cdProject) {
        this.cdProject = cdProject;
    }

}