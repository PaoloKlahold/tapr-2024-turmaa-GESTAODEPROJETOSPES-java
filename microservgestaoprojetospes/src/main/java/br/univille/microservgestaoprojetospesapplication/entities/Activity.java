package br.univille.microservgestaoprojetospesapplication.entities;


import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import java.sql.Date;

@Container(containerName = "activity", autoCreateContainer = true, ru = "400")
public class Activity
{
    @Id
    @PartitionKey
    @GeneratedValue
    private String cdActivity;

    private String activityTitle;
    private String activitySubs;
    private Date dtStart;
    private Date dtEnd;

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

    public Date getDtStart() {
        return dtStart;
    }

    public void setDtStart(Date dtStart) {
        this.dtStart = dtStart;
    }

    public Date getDtEnd() {
        return dtEnd;
    }

    public void setDtEnd(Date dtEnd) {
        this.dtEnd = dtEnd;
    }
}