package com.company.pattern.chain;

public class Principal {

    private RequestHandler chain;

    public Principal() {
        chain = new Teacher(new Student(null));
    }

    public void makeRequest(Request req) {
        chain.handleRequest(req);
    }

}
