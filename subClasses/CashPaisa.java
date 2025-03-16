package org.interFace.chai.subClasses;

import org.interFace.chai.interFaces.IPaisaTaker;

public class CashPaisa implements IPaisaTaker {
    @Override
    public boolean takePaisa(int amount) {
        System.out.println("Cash me "+ amount +" rupaye liye!");
        return true;
    }
}
