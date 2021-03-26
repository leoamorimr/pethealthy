package br.com.leoamorimr.pethealthy.model;

import java.time.LocalDate;
import java.time.Period;

public class Dog extends Animal {

    private static final int MULTIPLY_BY = 7;

    public Dog(Long id, String name, String color, LocalDate birthDate) {
        super(id, name, color, birthDate);
    }

    public int getNaturalAge() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(super.getBirthDate(), now);
        return period.multipliedBy(MULTIPLY_BY).getYears();
    }

    @Override
    public String toString() {
        return super.toString() + " Dog{" + "Natural age=" + getNaturalAge() + '}';
    }
}
