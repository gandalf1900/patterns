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

}
