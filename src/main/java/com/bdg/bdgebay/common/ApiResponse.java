package com.bdg.bdgebay.common;

import org.springframework.http.HttpStatus;

/**
 * @author William Arustamyan
 */

public class ApiResponse<T> {

    private HttpStatus httpStatus;
    private String responseMessage;
    private T data;

    public ApiResponse(final T data, final String responseMessage, final HttpStatus status) {
        this.httpStatus = status;
        this.responseMessage = responseMessage;
        this.data = data;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
