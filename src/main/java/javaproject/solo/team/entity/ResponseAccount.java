package javaproject.solo.team.entity;

public class ResponseAccount {
    private int idAccount;
    private String fullname;
    private String email;
    private String address;
    private String privatekey;
    private String mpass;
    private String avatar;

    public ResponseAccount(int idAccount, String fullname, String email, String address, String privatekey, String mpass, String avatar) {
        this.idAccount = idAccount;
        this.fullname = fullname;
        this.email = email;
        this.address = address;
        this.privatekey = privatekey;
        this.mpass = mpass;
        this.avatar = avatar;
    }

    public ResponseAccount() {
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrivatekey() {
        return privatekey;
    }

    public void setPrivatekey(String privatekey) {
        this.privatekey = privatekey;
    }

    public String getMpass() {
        return mpass;
    }

    public void setMpass(String mpass) {
        this.mpass = mpass;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
