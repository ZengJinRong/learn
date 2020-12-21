package com.company.pattern.adapter;

final class App {
    private App() {
    }

    public static void main(final String[] args) {
        Headset headset = new Headset();
        TypeC typeC = new HeadsetAdapter(headset);
        IPhone iPhone = new IPhone(typeC);
        iPhone.communicateWithTypeC();
    }
}
