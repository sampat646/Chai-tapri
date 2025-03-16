package org.interFace.chai.subClasses;

import org.interFace.chai.interFaces.ICaller;

public class SoftCaller implements ICaller {
    @Override
    public void callCustomer(String customerName, String chai) {
        System.out.println("Hey "+customerName+" ji apka "+chai+" ready hai!");
    }
}
