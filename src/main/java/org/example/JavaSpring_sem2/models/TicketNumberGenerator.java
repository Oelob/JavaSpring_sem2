package org.example.JavaSpring_sem2.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class TicketNumberGenerator {

    public TicketNumberGenerator() {
    }

    public String createNewNumber(){
        return "Ticket #" + UUID.randomUUID();
    }
}
