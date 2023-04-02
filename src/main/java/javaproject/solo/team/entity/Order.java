package javaproject.solo.team.entity;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Set;
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private int idOrder;

    @Column(name = "creation_time", nullable = false)
    private Date creationTime;

    @Column(name = "total_price")
    private Float totalPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_account")
    private Account account;

    @OneToMany(mappedBy = "id.order", cascade = CascadeType.ALL)
    private List<DetailOrder> detailOrders;

    public Order() {
    }

    public Order(int idOrder, Date creationTime, Float totalPrice, Account account, List<DetailOrder> detailOrders) {
        this.idOrder = idOrder;
        this.creationTime = creationTime;
        this.totalPrice = totalPrice;
        this.account = account;
        this.detailOrders = detailOrders;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<DetailOrder> getDetailOrders() {
        return detailOrders;
    }

    public void setDetailOrders(List<DetailOrder> detailOrders) {
        this.detailOrders = detailOrders;
    }
}