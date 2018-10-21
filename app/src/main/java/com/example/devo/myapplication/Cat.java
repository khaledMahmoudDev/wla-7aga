
package com.example.devo.myapplication;


import java.util.List;

public class Cat {

    private Integer id;
    private String titleEN;
    private String titleAR;
    private String photo;
    private String productCount;
    private String haveModel;
    private List<SubCategory> subCategories = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Cat() {
    }
    public Cat(Integer id, String titleEN, String titleAR, String photo, String productCount, String haveModel, List<SubCategory> subCategories) {
        super();
        this.id = id;
        this.titleEN = titleEN;
        this.titleAR = titleAR;
        this.photo = photo;
        this.productCount = productCount;
        this.haveModel = haveModel;
        this.subCategories = subCategories;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitleEN() {
        return titleEN;
    }

    public void setTitleEN(String titleEN) {
        this.titleEN = titleEN;
    }

    public String getTitleAR() {
        return titleAR;
    }

    public void setTitleAR(String titleAR) {
        this.titleAR = titleAR;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getProductCount() {
        return productCount;
    }

    public void setProductCount(String productCount) {
        this.productCount = productCount;
    }

    public String getHaveModel() {
        return haveModel;
    }

    public void setHaveModel(String haveModel) {
        this.haveModel = haveModel;
    }

    public List<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

}