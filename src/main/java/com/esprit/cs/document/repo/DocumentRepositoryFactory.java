package com.esprit.cs.document.repo;

import com.esprit.cs.document.exceptions.DocumentException;
import com.esprit.cs.document.model.enums.DocumentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentRepositoryFactory {

    @Autowired
    BonTransfertRepository bonTransfertRepository;

    @Autowired
    BonRetourRepository bonRetourRepository;

    @Autowired
    BonLivraisonRepository bonLivraisonRepository;

    public DocumentRepository getRepository(DocumentType documentType) throws DocumentException {
        switch (documentType) {
            case BL:
                return bonLivraisonRepository;
            case BR:
                return bonRetourRepository;
            case BT:
                return bonTransfertRepository;
            default:
                throw new DocumentException("unsupported document type");
        }
    }

}
