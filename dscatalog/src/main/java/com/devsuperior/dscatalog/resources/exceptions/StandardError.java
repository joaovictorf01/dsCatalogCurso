package com.devsuperior.dscatalog.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StandardError {
    private long timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

}
