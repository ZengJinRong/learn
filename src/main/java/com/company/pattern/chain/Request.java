package com.company.pattern.chain;

public class Request {
    private RequestType requestType;
    private String requestDescription;

    public Request(RequestType requestType,String requestDescription) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }
}
