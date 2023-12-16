package org.avi.visistorPattern.element;

import org.avi.visistorPattern.visitor.RoomVisitor;

public interface RoomElement {
    void accept(RoomVisitor visitor);
    int getPrice();
    void setPrice(int price);
}
