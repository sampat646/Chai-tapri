package org.interFace.chai.service;

import org.interFace.chai.interFaces.ICaller;
import org.interFace.chai.interFaces.IChaiMaker;
import org.interFace.chai.interFaces.IPaisaTaker;

public class ChaiStall {
    private final IChaiMaker chaiMaker;
    private IPaisaTaker paisaTaker;

    public ChaiStall(IChaiMaker chaiMaker) {
        this.chaiMaker = chaiMaker;
        System.out.println("Chai Stall khul gaya with " + chaiMaker.getClass().getSimpleName() + ", bhai!");
    }

    public void setPaisaTaker(IPaisaTaker paisaTaker) {
        this.paisaTaker = paisaTaker;
        System.out.println("Paisa Taker set: " + paisaTaker.getClass().getSimpleName());
    }
    public void serveChai(String type, double amount, String name, ICaller caller) {
        System.out.println(chaiMaker.makeChai(type)); // Brew chai first
        if (paisaTaker != null) {
            paisaTaker.takePaisa((int) amount); // Then take paisa
        } else {
            System.out.println("Paisa aaya nahi ree");
        }
        caller.callCustomer(name, type);
    }
}
