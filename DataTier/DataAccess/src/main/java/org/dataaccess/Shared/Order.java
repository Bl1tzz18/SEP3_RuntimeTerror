package org.dataaccess.Shared;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "order", schema = "reverso_sep")
public class Order implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId")
    private int id;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

    private int total;

    private String status;

    public Order() {
    }

    public Order(int id, User user, int total, String status) {
        this.id = id;
        this.user = user;
        this.total = total;
        this.status = status;
    }

    public Order(User user, int total, String status) {
        this.user = user;
        this.total = total;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
