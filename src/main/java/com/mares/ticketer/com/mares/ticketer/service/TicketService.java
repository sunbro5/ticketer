package com.mares.ticketer.com.mares.ticketer.service;

import com.mares.ticketer.com.mares.ticketer.com.mares.ticketer.model.Ticket;
import com.mares.ticketer.com.mares.ticketer.factory.TicketFactory;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @author <a href="mailto:maresjan694@gmail.com">Jan Mares</a>, 30.10.2018
 */
@Service
public class TicketService {

    private Deque<Ticket> tickets = new ConcurrentLinkedDeque<>();
    private int ticketNumber = 1;

    /**
     * Create new ticket with sysdate, next ticket number, ticket order number as tickets size plus one
     * and save in repository
     *
     * @return ticket
     */
    public synchronized Ticket createTicket() {
        Ticket ticket = TicketFactory.createNewTicket(ticketNumber++, tickets.size());
        tickets.add(ticket);
        return ticket;
    }

    /**
     * Remove ticket from repository, recalculate tickets order numbers and return removed ticket
     * @return removed ticket
     */
    public synchronized Ticket removeTicket() {
        Ticket ticket = tickets.poll();
        recalculateTickets();
        return ticket;
    }

    /**
     * Return ticket from head of queue
     * @return first ticket
     */
    public Ticket getActualTicket() {
        return tickets.peek();
    }

    public void resetTicketNumber() {
        ticketNumber = 1;
    }

    private void recalculateTickets() {
        int orderNUmber = 0;
        for (Ticket ticket : tickets) {
            ticket.setTicketOrder(orderNUmber++);
        }
    }

}
