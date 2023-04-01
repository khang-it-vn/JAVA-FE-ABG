package javaproject.solo.team.entity;


import jakarta.persistence.*;
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_account")
    private int idAccount;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "address")
    private String address;

    @Column(name = "privatekey")
    private String privateKey;

    @Column(name = "mpass")
    private String mpass;

    public Account() {
    }

    public Account(int idAccount, String email, String avatar, String fullname, String address, String privateKey, String mpass) {
        this.idAccount = idAccount;
        this.email = email;
        this.avatar = avatar;
        this.fullname = fullname;
        this.address = address;
        this.privateKey = privateKey;
        this.mpass = mpass;
    }

    // getters and setters

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getMpass() {
        return mpass;
    }

    public void setMpass(String mpass) {
        this.mpass = mpass;
    }
}
