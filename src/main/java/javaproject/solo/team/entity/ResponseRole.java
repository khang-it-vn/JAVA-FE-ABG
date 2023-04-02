package javaproject.solo.team.entity;

public class ResponseRole {
    private int from ;
    private String token;

    public ResponseRole(int from, String token, String title) {
        this.from = from;
        this.token = token;
        this.title = title;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public ResponseRole() {
    }

    public ResponseRole(int from, String title) {
        this.from = from;
        this.title = title;
    }
}
