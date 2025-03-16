package org.interFace.chai.subClasses;

import org.interFace.chai.interFaces.IPaisaTaker;

public class UPIPaisa implements IPaisaTaker {
    @Override
    public boolean takePaisa(int amount) {
        System.out.println("UPI paisa me "+ amount +" rupaye liye!");
        return true;
    }
}
