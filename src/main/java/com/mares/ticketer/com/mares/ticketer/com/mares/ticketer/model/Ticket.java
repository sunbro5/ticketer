package com.mares.ticketer.com.mares.ticketer.com.mares.ticketer.model;

import java.util.Date;

/**
 * @author <a href="mailto:maresjan694@gmail.com">Jan Mares</a>, 30.10.2018
 */
public class Ticket {

    private int number;
    private Date createDate;
    private int ticketOrder;

    public Ticket(int number, Date createDate, int ticketOrder) {
        this.number = number;
        this.createDate = createDate;
        this.ticketOrder = ticketOrder;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getTicketOrder() {
        return ticketOrder;
    }

    public void setTicketOrder(int ticketOrder) {
        this.ticketOrder = ticketOrder;
    }
}
