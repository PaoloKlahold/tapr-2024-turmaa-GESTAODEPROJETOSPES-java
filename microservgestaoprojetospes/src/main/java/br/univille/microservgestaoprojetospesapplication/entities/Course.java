package br.univille.microservgestaoprojetospesapplication.entities;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;


@Container(containerName = "course", autoCreateContainer = true, ru = "400")
public class Course {

    @Id
    @PartitionKey
    @GeneratedValue
    private String id;

    private String name;
    private String status;

    public Course() {
    }

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
