package com.store.dishware.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Size {
    S("for toddlers"),
    M("for children"),
    L("for adults");

    String size;
}
