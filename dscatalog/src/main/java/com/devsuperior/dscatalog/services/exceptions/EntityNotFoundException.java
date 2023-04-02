package com.devsuperior.dscatalog.services.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntityNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public EntityNotFoundException(String msg) {
        super(msg);
    }

}
