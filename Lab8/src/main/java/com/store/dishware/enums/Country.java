package com.store.dishware.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Country {
    US("USA"),
    CN("China"),
    DE("Germany"),
    JP("Japan"),
    IN("India"),
    KR("South Korea"),
    MX("Mexico"),
    UK("United Kingdom"),
    TW("Taiwan"),
    CA("Canada"),
    UA("Ukraine");

    String country;
}
