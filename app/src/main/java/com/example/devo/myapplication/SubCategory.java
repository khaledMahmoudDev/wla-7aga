
package com.example.devo.myapplication;
import java.util.List;

public class SubCategory {

    private Integer id;
    private String titleEN;
    private String titleAR;
    private String photo;
    private String productCount;
    private String haveModel;
    private List<Object> subCategories = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public SubCategory() {
    }

    /**
     *
     * @param id
     * @param productCount
     * @param subCategories
     * @param titleAR
     * @param haveModel
     * @param titleEN
     * @param photo
     */
    public SubCategory(Integer id, String titleEN, String titleAR, String photo, String productCount, String haveModel, List<Object> subCategories) {
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

    public List<Object> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<Object> subCategories) {
        this.subCategories = subCategories;
    }

}