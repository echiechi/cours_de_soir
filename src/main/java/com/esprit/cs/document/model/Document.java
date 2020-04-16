package com.esprit.cs.document.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
public class Document {

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private int quantity;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
