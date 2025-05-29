package com.scm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class SocialLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String link;

    private String title;

    @ManyToOne
    private Contact contact;

    // === Constructors ===

    public SocialLink() {
    }

    public SocialLink( String link, String title, Contact contact) {

        this.link = link;
        this.title = title;
        this.contact = contact;
    }

    // === Getters and Setters ===



    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    // === toString() ===

    @Override
    public String toString() {
        return "SocialLink{" +
                "id=" + id +
                ", link='" + link + '\'' +
                ", title='" + title + '\'' +
                ", contact=" + (contact != null ? contact.toString() : null) +
                '}';
    }
}
