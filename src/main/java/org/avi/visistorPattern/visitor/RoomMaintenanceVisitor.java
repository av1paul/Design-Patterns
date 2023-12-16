package org.avi.visistorPattern.visitor;

import org.avi.visistorPattern.element.DoubleRoom;
import org.avi.visistorPattern.element.SingleRoom;

public class RoomMaintenanceVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Maintaining Single Room");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Maintaining Double Room");
    }
}
