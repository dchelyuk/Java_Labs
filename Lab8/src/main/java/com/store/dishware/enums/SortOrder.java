package com.store.dishware.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SortOrder {
    ASCENDING(0),
    DESCENDING(1);

    int sortOrder;
}
