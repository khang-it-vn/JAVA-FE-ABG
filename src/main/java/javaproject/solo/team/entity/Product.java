package javaproject.solo.team.entity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private int idProduct;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "description")
    private String description;

    @Column(name = "price", nullable = false)
    private Float price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Category category;

    @OneToMany(mappedBy = "id.product", cascade = CascadeType.ALL)
    private List<DetailOrder> detailOrders;

    public Product() {
    }
}
