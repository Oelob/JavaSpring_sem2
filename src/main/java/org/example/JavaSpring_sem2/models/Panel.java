package org.example.JavaSpring_sem2.models;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Panel {
    private final TicketNumberGenerator ticketNumberGenerator = new TicketNumberGenerator();


    public Ticket newTicket(){
        return new Ticket(this.ticketNumberGenerator.createNewNumber(), LocalDateTime.now());
    }
}
