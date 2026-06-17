package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StatistiqueTests {

    @Test
    void calculerPrixMoyenAvecDeuxVoitures() {
        StatistiqueImpl statistique = new StatistiqueImpl();

        statistique.ajouter(new Voiture("Toyota", 1000));
        statistique.ajouter(new Voiture("BMW", 3000));

        Echantillon resultat = statistique.prixMoyen();

        assertEquals(2, resultat.getNombreDeVoitures());
        assertEquals(2000, resultat.getPrixMoyen());
    }

    @Test
    void calculerPrixMoyenAvecUneVoiture() {
        StatistiqueImpl statistique = new StatistiqueImpl();

        statistique.ajouter(new Voiture("Ferrari", 5000));

        Echantillon resultat = statistique.prixMoyen();

        assertEquals(1, resultat.getNombreDeVoitures());
        assertEquals(5000, resultat.getPrixMoyen());
    }

    @Test
    void prixMoyenSansVoitureProvoqueException() {
        StatistiqueImpl statistique = new StatistiqueImpl();

        assertThrows(ArithmeticException.class, statistique::prixMoyen);
    }
}