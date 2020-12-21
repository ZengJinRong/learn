package com.company.pattern.chain;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.makeRequest(new Request(RequestType.MEETING, "教学质量研讨会"));
        principal.makeRequest(new Request(RequestType.MEETING, "假期注意事项"));
        principal.makeRequest(new Request(RequestType.VACATION, "解放了！"));
    }
}
