package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

        @Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
            private final List<Job> jobs = new ArrayList<>();
   // pretty sure i gotta make a not blank with a size constraint will come back
    private String description;

    public Skill(){}

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public List<Job> getJobs(){
        return jobs;
    }

    public void addJob(Job job) {
        this.jobs.add(job);
    }
}