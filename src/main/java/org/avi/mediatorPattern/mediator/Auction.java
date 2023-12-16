package org.avi.mediatorPattern.mediator;

import org.avi.mediatorPattern.colleague.Bidder;
import org.avi.mediatorPattern.colleague.Colleague;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {

    private List<Colleague> bidders;

    public Auction() {
        this.bidders = new ArrayList<>();
    }

    @Override
    public void addBidder(Colleague bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for(Colleague colleague : bidders) {
            if(bidder.getName().equals(colleague.getName())) {
                continue;
            }
            colleague.receiveBidNotification(bidAmount);
        }
    }
}
