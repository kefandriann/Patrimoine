package org.patrimoine.models;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@AllArgsConstructor
public class Patrimoine {
    private final Personne proprietaire;
    private final LocalDate date;
    private final Set<Possession> possessions;

    public Double projectionFuture(LocalDate dateFuture) {
        return null;
    }
}
