package org.avi.visistorPattern.visitor;

import org.avi.visistorPattern.element.DoubleRoom;
import org.avi.visistorPattern.element.RoomElement;
import org.avi.visistorPattern.element.SingleRoom;

public interface RoomVisitor {
    void visit(SingleRoom singleRoom);
    void visit(DoubleRoom doubleRoom);
}
