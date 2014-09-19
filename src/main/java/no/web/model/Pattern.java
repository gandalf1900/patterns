package no.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
public class Pattern {

    @Id
    private long id;


    @Column
    private String name;

    @Column
    private String alternativeName;

    @Column
    private String description;

    @Column
    private String longDescription;

    @Column
    private String type;

    public Pattern() {
    }

    public Pattern(String name, String alternativeName, String description, String longDescription, String type) {
        this.name = name;
        this.alternativeName = alternativeName;
        this.description = description;
        this.longDescription = longDescription;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAlternativeName() {
        return alternativeName;
    }

    public String getDescription() {
        return description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getType() {
        return type;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAlternativeName(String alternativeName) {
        this.alternativeName = alternativeName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public void setType(String type) {
        this.type = type;
    }

}
