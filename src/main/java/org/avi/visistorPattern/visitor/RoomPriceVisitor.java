package org.avi.visistorPattern.visitor;

import org.avi.visistorPattern.element.DoubleRoom;
import org.avi.visistorPattern.element.SingleRoom;

public class RoomPriceVisitor implements RoomVisitor {

    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Setting price for Single Room");
        singleRoom.setPrice(100);
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Setting price for Double Room");
        doubleRoom.setPrice(500);
    }
}
