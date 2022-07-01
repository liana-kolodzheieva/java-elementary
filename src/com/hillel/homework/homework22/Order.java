package com.hillel.homework.homework22;

import java.time.LocalDateTime;

import static com.hillel.homework.homework22.Status.NEW;

public class Order {
    private Status status;
    private long number;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Order(long number) {
        this.number = number;
        this.createdAt = LocalDateTime.now();
        this.status = NEW;
        this.updatedAt = LocalDateTime.now();
    }

    public Order(Status status, long number, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.status = status;
        this.number = number;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }



    @Override
    public String toString() {
        return "Order{" +
                "status=" + status +
                ", number=" + number +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Status getStatus() {
        return status;
    }

    public long getNumber() {
        return number;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
