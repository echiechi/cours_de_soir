package com.esprit.cs.document.model;


import com.esprit.cs.document.model.enums.DocumentType;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private DocumentType type;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate date;
    private int quantity;

    public Document() {

    }

    public Document(long id, DocumentType type, LocalDate date, int quantity) {
        this.id = id;
        this.type = type;
        this.date = date;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public DocumentType getType() {
        return type;
    }

    public void setType(DocumentType type) {
        this.type = type;
    }

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
