package com.edgenda.bnc.skillsmanager.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.PersistenceConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.List;
@Entity
public class Event {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String description;

    @NotEmpty
    private String startDate;
    @NotEmpty
    private String endDate;
    @NotEmpty
    private String location;

   

    @ManyToMany
    @JoinTable(name = "GUEST_LIST")
    private List<Guest> guests;

    public Event() {
    }

    public Event(Long id, String name, String description, String startDate,String endDate, String location, List<Guest> guests) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.guests = guests;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;

    }

    @PersistenceConstructor
    public Event(String name, String description, String startDate,String endDate, String location, List<Guest> guests) {
        this.name = name;
        this.description = description;
        this.guests = guests;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }
}
