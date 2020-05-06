package com.esprit.cs.document.model;

import com.esprit.cs.document.model.enums.DocumentType;
import com.esprit.cs.document.model.generator.CustomIdGenerator;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

@Entity
@Table(name = "document")
public class BonRetour extends Document {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "br_seq")
    @GenericGenerator(
            name = "br_seq",
            strategy = "com.esprit.cs.document.model.generator.CustomIdGenerator",
            parameters = {
                    @Parameter(name = CustomIdGenerator.INCREMENT_PARAM, value = "50"),
                    @Parameter(name = CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "BR_"),
                    @Parameter(name = CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%09d")})
    private String id;
    private DocumentType type = DocumentType.BR;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DocumentType getType() {
        return type;
    }
}
