package org.interFace.chai.subClasses;

import org.interFace.chai.interFaces.ICaller;

public class LoudCaller implements ICaller {
    @Override
    public void callCustomer(String customerName, String chai) {
        System.out.println("Oye "+customerName+" tera "+chai+" ready hai le aaja");
    }
}
