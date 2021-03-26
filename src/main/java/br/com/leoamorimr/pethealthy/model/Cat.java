package br.com.leoamorimr.pethealthy.model;

import java.time.LocalDate;

public class Cat extends Animal {

    public Cat(Long id, String name, String color, LocalDate birthDate) {
        super(id, name, color, birthDate);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
