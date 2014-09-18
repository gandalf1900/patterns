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

}
