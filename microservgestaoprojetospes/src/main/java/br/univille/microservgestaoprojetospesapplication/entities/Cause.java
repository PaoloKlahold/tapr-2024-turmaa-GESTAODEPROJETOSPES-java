package br.univille.microservgestaoprojetospesapplication.entities;


import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "cause", autoCreateContainer = true)
public class Cause
{
    @Id
    @PartitionKey
    @GeneratedValue
    private String cdCause;

    private String causeTitle;
    private String causeSubs;
    private String cdProblem;

    public String getCdCause() {
        return cdCause;
    }

    public void setCdCause(String cdCause) {
        this.cdCause = cdCause;
    }

    public String getCauseTitle() {
        return causeTitle;
    }

    public void setCauseTitle(String causeTitle) {
        this.causeTitle = causeTitle;
    }

    public String getCauseSubs() {
        return causeSubs;
    }

    public void setCauseSubs(String causeSubs) {
        this.causeSubs = causeSubs;
    }

    public String getCdProblem() {
        return cdProblem;
    }

    public void setCdProblem(String cdProblem) {
        this.cdProblem = cdProblem;
    }
}