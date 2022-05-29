package com.burakyapici.whatsappclonebackend.Results;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result<T> {
    private Boolean error;
    private T data;
    private String message;
}
