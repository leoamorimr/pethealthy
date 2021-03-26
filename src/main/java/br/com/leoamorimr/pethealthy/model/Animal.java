package br.com.leoamorimr.pethealthy.model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public abstract class Animal {

    @Id
    @SequenceGenerator(name = "animal_seq", sequenceName = "animal_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "animal_seq")
    private Long id;

    @Column
    private String name;

    @Column
    private String color;

    @Column
    private LocalDate birthDate;

    Animal(Long id, String name, LocalDate birthDate) {
    }

    Animal(Long id, String name, String color, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }


    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", name='" + name + '\'' + ", color='" + color + '\'' + ", birthDate=" + birthDate + '}';
    }
}
