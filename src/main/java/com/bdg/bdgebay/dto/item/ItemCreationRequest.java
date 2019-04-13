package com.bdg.bdgebay.dto.item;

import com.bdg.bdgebay.common.CategoryType;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ItemCreationRequest {

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    private Double price;

    @NotNull
    private String description;

    @NotNull
    private CategoryType categoryType;

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

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }
}
