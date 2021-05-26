package com.store.dishware.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Purpose {
    STARTERS(1),
    MAIN_COURSE(2),
    DESSERTS(3);

    int purpose;
}
