package com.booleanuk.api.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "studio")
    private String studio;

    @Column(name = "rating")
    private int rating;

    @Column(name = "playerCount")
    private int playerCount;

    @Column(name = "genre")
    private String genre;

    public Game(String title, String studio, int rating, int playerCount, String genre) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
        this.playerCount = playerCount;
        this.genre = genre;
    }
}
