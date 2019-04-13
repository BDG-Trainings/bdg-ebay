package com.bdg.bdgebay.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_item")
public class Item {

    @Id
    @SequenceGenerator(name = "seq_item", sequenceName = "seq_item")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item")
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    private Long id;

    private String name;
    private double price;
    private String description;
    private Category category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
