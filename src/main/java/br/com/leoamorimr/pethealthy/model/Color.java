package br.com.leoamorimr.pethealthy.model;

import javax.persistence.*;

@Entity
public enum Color {

    BLACK("Marrom"), WHITE("Branco"), BROWN("Marrom");

    @Id
    @SequenceGenerator(name = "color_seq", sequenceName = "color_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "color_seq")
    private Long id;

    @Column
    private String color;

    private Color(String color) {
        this.color = color;
    }

    private Color(Long id, String color) {
        this.id = id;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Long getId() {
        return id;
    }
}
