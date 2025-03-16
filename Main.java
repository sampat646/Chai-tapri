package org.interFace.chai;

import org.interFace.chai.service.ChaiStall;
import org.interFace.chai.subClasses.*;

public class Main {
    public static void main(String[] args) {
        ChaiStall chaiStall = new ChaiStall(new SimpleChaiMaker());
        chaiStall.setPaisaTaker(new CashPaisa());
        chaiStall.serveChai("Masala", 10.00, "Rahul", new LoudCaller());
        chaiStall.setPaisaTaker(new UPIPaisa());
        chaiStall.serveChai("Cutting", 10.00, "Shyam", new SoftCaller());
    }
}
