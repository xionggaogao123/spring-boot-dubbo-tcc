package com.eadydb.tcc.order.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author eadydb
 * @date 2017-12-04 10:31
 * <p/>
 * @description
 */
public class Product implements Serializable {

    private long productId;

    private long shopId;

    private String productName;

    private BigDecimal price;

    public Product() {
    }

    public Product(long productId, long shopId, String productName, BigDecimal price) {
        this.productId = productId;
        this.shopId = shopId;
        this.productName = productName;
        this.price = price;
    }

    public long getProductId() {
        return productId;
    }

    public long getShopId() {
        return shopId;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
