package org.patrimoine.models;

import java.time.LocalDate;

public final class TrainDeVie extends Possession {

    public TrainDeVie(String nomDeLaPossession, LocalDate aDateDe, Argent valeur) {
        super(nomDeLaPossession, aDateDe, valeur);
    }

    @Override
    public Possession projectionFuture(LocalDate dateFuture) {
        return null;
    }
}
