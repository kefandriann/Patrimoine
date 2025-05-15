package org.patrimoine.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Argent {
    private final Devise devise;
    private final Double montant;
}
