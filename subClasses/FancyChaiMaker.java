package org.interFace.chai.subClasses;

import org.interFace.chai.interFaces.IChaiMaker;

public class FancyChaiMaker implements IChaiMaker {
    @Override
    public String makeChai(String type) {
        return type + " chai with extra malai, bhai!";
    }
}
