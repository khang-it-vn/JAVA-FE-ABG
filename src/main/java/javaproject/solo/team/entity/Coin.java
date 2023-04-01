package javaproject.solo.team.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "coin")
public class Coin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_coin")
    private int idCoin;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "image")
    private String image;

    @Column(name = "symbol")
    private String symbol;

    public Coin() {
    }

    public Coin(int idCoin, String fullname, String image, String symbol) {
        this.idCoin = idCoin;
        this.fullname = fullname;
        this.image = image;
        this.symbol = symbol;
    }

    // getters and setters

    public int getIdCoin() {
        return idCoin;
    }

    public void setIdCoin(int idCoin) {
        this.idCoin = idCoin;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}