package com.devsuperior.dscatalog.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Category {

    private Long id;
    private String name;

    public Category(long l, String string) {
        this.id = l;
        this.name = string;

    }

}
