package org.avi.visistorPattern.element;

import org.avi.visistorPattern.visitor.RoomVisitor;

public class DoubleRoom implements RoomElement {

    private int price;

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }
}
