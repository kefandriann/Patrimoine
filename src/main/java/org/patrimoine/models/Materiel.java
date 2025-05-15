package org.patrimoine.models;

import java.time.LocalDate;

public final class Materiel extends Possession {
    private final Double tauxDAppreciation;
    private final LocalDate dateDAcquisition;

    public Materiel(String nomDeLaPossession, LocalDate aDateDe, Argent valeur, Double tauxDAppreciation, LocalDate dateDAcquisition) {
        super(nomDeLaPossession, aDateDe, valeur);
        this.tauxDAppreciation = tauxDAppreciation;
        this.dateDAcquisition = dateDAcquisition;
    }

    @Override
    public Possession projectionFuture(LocalDate dateFuture) {
        return null;
    }
}