package org.avi.visistorPattern;

import org.avi.visistorPattern.element.DoubleRoom;
import org.avi.visistorPattern.element.RoomElement;
import org.avi.visistorPattern.element.SingleRoom;
import org.avi.visistorPattern.visitor.RoomMaintenanceVisitor;
import org.avi.visistorPattern.visitor.RoomPriceVisitor;
import org.avi.visistorPattern.visitor.RoomVisitor;

public class Main {
    public static void main(String[] args) {
        RoomElement singleRoom = new SingleRoom();
        RoomElement doubleRoom = new DoubleRoom();
        RoomVisitor priceVisitor = new RoomPriceVisitor();
        priceVisitor.visit((SingleRoom) singleRoom);
        System.out.println(singleRoom.getPrice());
        RoomVisitor maintenanceVisitor = new RoomMaintenanceVisitor();
        maintenanceVisitor.visit((DoubleRoom) doubleRoom);
    }
}
