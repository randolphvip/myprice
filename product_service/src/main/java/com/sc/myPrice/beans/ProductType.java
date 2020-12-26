package com.sc.myPrice.beans;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

public class ProductType {
    private Integer productTypeId;

    private String productTypeName;

    private String parentProductTypeId;

    private Integer status;

    private Date createTime;

    public Integer getProductTypeId() {
        return productTypeId;
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
}