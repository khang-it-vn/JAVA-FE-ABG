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

    public Product(int idProduct, String name, String image, String description, Float price, Category category, List<DetailOrder> detailOrders) {
        this.idProduct = idProduct;
        this.name = name;
        this.image = image;
        this.description = description;
        this.price = price;
        this.category = category;
        this.detailOrders = detailOrders;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<DetailOrder> getDetailOrders() {
        return detailOrders;
    }

    public void setDetailOrders(List<DetailOrder> detailOrders) {
        this.detailOrders = detailOrders;
    }
}
