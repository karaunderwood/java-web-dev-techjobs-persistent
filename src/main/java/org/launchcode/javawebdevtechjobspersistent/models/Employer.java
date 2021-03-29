package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required")
    @Size(min = 3, max = 90, message = "Location must be between 3 and 90 characters")
    private String location;

    // Within Employer, add a private property jobs of type List<Job> and initialize it to an empty ArrayList.
    @OneToMany
    @JoinColumn
    private final List<Job> jobs = new ArrayList<>();


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer() {
    }

    public List<Job> getJobs() {
        return jobs;
    }
}
