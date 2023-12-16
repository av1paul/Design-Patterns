package org.avi.mediatorPattern.mediator;

import org.avi.mediatorPattern.colleague.Colleague;

public interface AuctionMediator {
    void addBidder(Colleague bidder);
    void placeBid(Colleague bidder, int bidAmount);

}
