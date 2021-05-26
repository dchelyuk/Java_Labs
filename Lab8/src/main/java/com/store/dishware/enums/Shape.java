package com.store.dishware.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Shape {
    ROUND("Round"),
    SQUARE("Square"),
    COUPE("Coupe"),
    TRIANGULAR("Triangular"),
    OBLONG("Oblong");

    String shape;
}
