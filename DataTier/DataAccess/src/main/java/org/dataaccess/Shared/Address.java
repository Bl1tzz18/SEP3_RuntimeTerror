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

    private String country = "";

    private String city = "";

    private String zip = "";

    private String street = "";

    @OneToOne(mappedBy = "address")
    private User user;

    public Address(String country, String city, String zip, String street) {
        this.country = country;
        this.city = city;
        this.zip = zip;
        this.street = street;
    }

    public Address() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
