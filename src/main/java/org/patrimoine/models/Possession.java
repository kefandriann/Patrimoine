package org.patrimoine.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public abstract sealed class Possession permits Compte, Materiel, TrainDeVie {
    private final String nom;
    private final LocalDate aDateDe;
    private final Argent valeur;

    public abstract Possession projectionFuture(LocalDate dateFuture);
}
