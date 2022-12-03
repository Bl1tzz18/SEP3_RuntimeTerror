package org.dataaccess.Shared;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address", schema = "reverso_sep")
public class Address implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "varchar(255) default ' '")
    private String country;

    @Column(columnDefinition = "varchar(255) default ' '")
    private String city;

    @Column(columnDefinition = "varchar(255) default ' '")
    private String zip;

    @Column(columnDefinition = "varchar(255) default ' '")
    private String street;


}
