package javaproject.solo.team.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class DetailOrderId implements Serializable {
    @Column(name = "id_order")
    private int idOrder;

    @Column(name = "id_product")
    private int idProduct;

    public DetailOrderId() {
    }

    public DetailOrderId(int idOrder, int idProduct) {
        this.idOrder = idOrder;
        this.idProduct = idProduct;
    }

    // getters and setters

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
}
