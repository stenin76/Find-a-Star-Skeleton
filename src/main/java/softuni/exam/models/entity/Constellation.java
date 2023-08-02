package softuni.exam.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "constellations")
public class Constellation extends BaseEntity {


    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String description;

    public Constellation() {
    }

    public Constellation(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
