package com.shops.dishwarestore.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Purpose {
    STARTERS(1),
    MAIN_COURSE(2),
    DESSERTS(3);

    int purpose;
}
