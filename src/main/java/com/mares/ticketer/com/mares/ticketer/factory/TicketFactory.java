package com.mares.ticketer.com.mares.ticketer.factory;

import com.mares.ticketer.com.mares.ticketer.com.mares.ticketer.model.Ticket;

import java.util.Date;

/**
 * @author <a href="mailto:maresjan694@gmail.com">Jan Mares</a>, 30.10.2018
 */
public class TicketFactory {

    private TicketFactory(){

    }

    /**
     * Create ticket with sysdate
     *
     * @param ticketNumber
     * @param ticketOrderNumber
     * @return
     */
    public static Ticket createNewTicket(int ticketNumber, int ticketOrderNumber) {
        return new Ticket(ticketNumber, new Date(), ticketOrderNumber);
    }

}
