package com.mares.ticketer.com.mares.ticketer.controller;

import com.mares.ticketer.com.mares.ticketer.com.mares.ticketer.exception.ResourceNotFoundException;
import com.mares.ticketer.com.mares.ticketer.com.mares.ticketer.model.Ticket;
import com.mares.ticketer.com.mares.ticketer.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:maresjan694@gmail.com">Jan Mares</a>, 30.10.2018
 */
@RestController()
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public Ticket createTicket() {
        return ticketService.createTicket();
    }

    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public Ticket removeTicket() {
        return checkNotNull(ticketService.removeTicket());
    }

    @RequestMapping(value = "/actual", method = RequestMethod.GET)
    public Ticket getActualTicket() {
        return checkNotNull(ticketService.getActualTicket());
    }

    private Ticket checkNotNull(Ticket ticket) {
        if (ticket == null) {
            throw new ResourceNotFoundException();
        }
        return ticket;
    }


}
