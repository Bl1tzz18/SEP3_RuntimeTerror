package org.dataaccess.Shared;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "cart", schema = "reverso_sep")
public class Cart implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cartId")
    private int id;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "username")
    private User user;

    private int total;

    public Cart() {
    }

    public Cart(User user) {
        this.user = user;
    }

    public Cart(User username, int total) {
        this.user = username;
        this.total = total;
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
}
