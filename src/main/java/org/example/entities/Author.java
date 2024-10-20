package org.example.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.awt.print.Book;
import java.util.HashSet;
import java.util.Set;

import static java.util.HashSet.newHashSet;

@Entity
@Table(name = "authors")
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    private String lastname;
    @Column(length = 100)
    private String bio;
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();// Getter,
}
