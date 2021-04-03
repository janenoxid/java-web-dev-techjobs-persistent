package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Please enter a valid location.")
    @Size(max = 100, message = "Must be less than 100 characters.")
    private String location;

    @OneToMany // do i need to do something else??
    @JoinColumn(name = "employer_id")// not sure if this is what i need to do?
    private List<Job> jobs = new ArrayList<>();

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    // TODO don't forget to add your SQL statements to the SQL document.
    // SQL TASK: At this point, you will have one table, job. In queries.sql under “Part 1”, list the columns and their data types in the table.
    // SQL TASK: In queries.sql under “Part 2”, write a query to list the names of the employers in St. Louis City.
    // SQL TASK: In queries.sql under “Part 3”, write the SQL statement to remove the job table.
    // SQL TASK: In queries.sql under “Part 4”, write a query to return a list of the names and descriptions of all skills that are attached to jobs in alphabetical order. If a skill does not have a job listed, it should not be included in the results of this query.

}
