package com.company.pattern.chain;

public class Teacher extends RequestHandler {
    public Teacher(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request req) {
        RequestType requestType = req.getRequestType();
        if (RequestType.MEETING.equals(requestType)) {
            System.out.println("Teacher Meeting :" + req.getRequestDescription());
        } else if (RequestType.VACATION.equals(requestType)) {
            System.out.println("Teacher go home :" + req.getRequestDescription());
            super.handleRequest(req);
        }
    }
}
