package com.example.demo.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoitureTest {

    @Test
    void creerVoitureAvecConstructeur() {
        Voiture voiture = new Voiture("Ferrari", 2000);

        assertEquals("Ferrari", voiture.getMarque());
        assertEquals(2000, voiture.getPrix());
    }

    @Test
    void modifierPrixVoiture() {
        Voiture voiture = new Voiture("Ferrari", 2000);

        voiture.setPrix(3000);

        assertEquals(3000, voiture.getPrix());
    }

    @Test
    void modifierMarqueVoiture() {
        Voiture voiture = new Voiture();

        voiture.setMarque("Toyota");

        assertEquals("Toyota", voiture.getMarque());
    }

    @Test
    void modifierIdVoiture() {
        Voiture voiture = new Voiture();

        voiture.setId(10);

        assertEquals(10, voiture.getId());
    }

    @Test
    void testerToString() {
        Voiture voiture = new Voiture("BMW", 5000);
        voiture.setId(1);

        assertEquals("Car{marque='BMW', prix=5000, id=1}", voiture.toString());
    }
}