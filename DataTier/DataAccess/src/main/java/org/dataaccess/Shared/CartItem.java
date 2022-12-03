package org.dataaccess.Shared;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cart_items", schema = "reverso_sep")
public class CartItem implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cartItemsId")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cart_Id", nullable = false, referencedColumnName = "cartId")
    private Cart cart;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false, referencedColumnName = "id")
    private Product product;

    /*private String username;*/

    public CartItem() {
    }

    public CartItem(Cart cart, Product product/*, String username*/) {
        this.cart = cart;
        this.product = product;
        /*this.username = username;*/
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    /*public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }*/
}
