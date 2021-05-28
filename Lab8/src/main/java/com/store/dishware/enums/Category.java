package com.store.dishware.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Category {
    DISPOSABLE_TABLEWARE("Disposable tableware"),
    BAKING_UTENSILS("Baking utensils");

   String categoryName;

}

