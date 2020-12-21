package com.company.pattern.adapter;

class HeadsetAdapter implements TypeC {
    private Headset headset;

    HeadsetAdapter(Headset headset) {
        this.headset = headset;
    }

    @Override
    public void communicateWithTypeC() {
        headset.communicate3M();
    }
}
