package org.example.JavaSpring_sem2.models;

import java.time.LocalDateTime;

public class Ticket {
    private String number;
    private LocalDateTime createAt;

    public Ticket(String number, LocalDateTime createAt) {
        this.number = number;
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number='" + number + '\'' +
                ", createAt=" + createAt +
                '}';
    }
}
