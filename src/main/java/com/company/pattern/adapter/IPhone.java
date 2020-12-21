package com.company.pattern.adapter;

class IPhone {
    private TypeC typeC;

    IPhone(TypeC typeC) {
        this.typeC = typeC;
    }

    void communicateWithTypeC() {
        typeC.communicateWithTypeC();
    }
}
