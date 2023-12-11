package com.deeprajgawand.rest.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public class CloudVendorException {
//    eniter exception details will be filled which will be sent back to client

    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
}
