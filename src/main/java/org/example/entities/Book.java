package org.example.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    private String title;
    private String description;
    private String author;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    @ManyToMany
    @JoinTable
    name("author_books")

    private<List> Author authors;

    @ManyToMany
    @JoinTable
    name("request_books")

    private<List> Request requests;
}
}


