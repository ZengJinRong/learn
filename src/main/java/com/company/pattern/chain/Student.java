package com.company.pattern.chain;

public class Student extends RequestHandler {
    public Student(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request req) {
        if (RequestType.VACATION.equals(req.getRequestType())) {
            System.out.println("Student go home: " + req.getRequestDescription());
        }
        super.handleRequest(req);
    }
}
