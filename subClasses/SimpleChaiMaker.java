package org.interFace.chai.subClasses;

import org.interFace.chai.interFaces.IChaiMaker;

public class SimpleChaiMaker implements IChaiMaker {
    @Override
    public String makeChai(String type) {
        return type + " chai ban gaya!";
    }
}
