package org.avi.mediatorPattern.colleague;

import org.avi.mediatorPattern.mediator.AuctionMediator;

public class Bidder implements Colleague {

    private String name;
    private AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Bidder " + name + " got a notification that someone placed a bid of Rs. " + bidAmount);
    }

    public String getName() {
        return name;
    }
}
