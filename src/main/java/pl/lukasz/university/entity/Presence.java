package pl.lukasz.university.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Presence {

    @Id
    private Long id;
    private String present;

    public Presence() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPresent() {
        return present;
    }

    public void setPresent(String present) {
        this.present = present;
    }
}
