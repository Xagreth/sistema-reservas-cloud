package com.alkemy.reservas.booking.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long userId;    // ID del usuario que reserva
    private Long spaceId;   // ID del espacio reservado
    private LocalDate date; // Fecha de la reserva
    private String status;  // CONFIRMED, CANCELLED

    public Booking() {}
    public Booking(Long userId, Long spaceId, LocalDate date, String status) {
        this.userId = userId;
        this.spaceId = spaceId;
        this.date = date;
        this.status = status;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public Long getSpaceId() { return spaceId; }
    public void setSpaceId(Long spaceId) { this.spaceId = spaceId; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
