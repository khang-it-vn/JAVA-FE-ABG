package javaproject.solo.team.entity;

import jakarta.persistence.*;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class DetailOrderId implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product")
    private Product product;

    public DetailOrderId() {
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public DetailOrderId(Order order, Product product) {
        this.order = order;
        this.product = product;
    }
}
