package com.deeprajgawand.rest.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CloudVendorNotFoundException extends RuntimeException{

    public CloudVendorNotFoundException(String message){
        super (message);
    }
}
