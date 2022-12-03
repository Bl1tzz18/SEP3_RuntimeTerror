package org.dataaccess.Shared;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "products", schema = "reverso_sep")
public class Product implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String imgPath;

    private int price;

    private String description;

    @Column(columnDefinition = "boolean default true")
    private boolean inStock;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    public Product(int id, String name, String imgPath, int price, String description, boolean inStock, Category category) {
        this.id = id;
        this.name = name;
        this.imgPath = imgPath;
        this.price = price;
        this.description = description;
        this.inStock = inStock;
        this.category = category;
    }

    public Product(String name, String imgPath, int price, String description, boolean inStock, Category category) {
        this.name = name;
        this.imgPath = imgPath;
        this.price = price;
        this.description = description;
        this.inStock = inStock;
        this.category = category;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
