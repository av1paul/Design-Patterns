package org.avi.mediatorPattern;

import org.avi.mediatorPattern.colleague.Bidder;
import org.avi.mediatorPattern.colleague.Colleague;
import org.avi.mediatorPattern.mediator.Auction;
import org.avi.mediatorPattern.mediator.AuctionMediator;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionManager = new Auction();
        Colleague a = new Bidder("A", auctionManager);
        Colleague b = new Bidder("B", auctionManager);
        Colleague c = new Bidder("C", auctionManager);
        a.placeBid(150);
        b.placeBid(200);
    }
}
