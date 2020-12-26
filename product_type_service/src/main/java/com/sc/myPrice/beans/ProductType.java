package com.sc.myPrice.beans;

import java.util.Date;
import javax.persistence.*;

@Table(name = "product_type")
public class ProductType {
    @Id
    @Column(name = "product_type_id")
    private Integer productTypeId;

    @Column(name = "product_type_name")
    private String productTypeName;

    @Column(name = "parent_product_type_id")
    private String parentProductTypeId;

    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return product_type_id
     */
    public Integer getProductTypeId() {
        return productTypeId;
    }

    /**
     * @param productTypeId
     */
    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    /**
     * @return product_type_name
     */
    public String getProductTypeName() {
        return productTypeName;
    }

    /**
     * @param productTypeName
     */
    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    /**
     * @return parent_product_type_id
     */
    public String getParentProductTypeId() {
        return parentProductTypeId;
    }

    /**
     * @param parentProductTypeId
     */
    public void setParentProductTypeId(String parentProductTypeId) {
        this.parentProductTypeId = parentProductTypeId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "productTypeId=" + productTypeId +
                ", productTypeName='" + productTypeName + '\'' +
                ", parentProductTypeId='" + parentProductTypeId + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                '}';
    }
}