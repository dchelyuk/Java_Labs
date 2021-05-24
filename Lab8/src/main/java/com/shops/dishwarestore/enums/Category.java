package com.shops.dishwarestore.enums;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public enum Category {
    DisposableTableware("Disposable tableware"),
    BakingUtensils("Baking utensils");

    String category;

}
