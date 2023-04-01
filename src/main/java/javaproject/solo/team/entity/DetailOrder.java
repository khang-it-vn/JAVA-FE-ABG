package javaproject.solo.team.entity;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "detailorder")
public class DetailOrder {
    @EmbeddedId
    private DetailOrderId id;

    @Column(name = "quantity")
    private int quantity;

    public DetailOrder() {
    }

    public DetailOrder(DetailOrderId id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }
// getters and setters

    public DetailOrderId getId() {
        return id;
    }

    public void setId(DetailOrderId id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
