package javaproject.solo.team.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "doc")
public class Doc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_doc")
    private int idDoc;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "content")
    private String content;

    public Doc(int idDoc, String title, String description, String content) {
        this.idDoc = idDoc;
        this.title = title;
        this.description = description;
        this.content = content;
    }

    public Doc() {

    }

    // getters and setters

    public int getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description;}

}

