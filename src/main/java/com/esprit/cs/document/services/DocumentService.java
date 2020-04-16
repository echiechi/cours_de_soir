package com.esprit.cs.document.services;

import com.esprit.cs.document.model.factory.DocumentFactory;
import com.esprit.cs.document.exceptions.DocumentException;
import com.esprit.cs.document.model.BonLivraison;
import com.esprit.cs.document.model.BonRetour;
import com.esprit.cs.document.model.BonTransfert;
import com.esprit.cs.document.model.Document;
import com.esprit.cs.document.model.enums.DocumentType;
import com.esprit.cs.document.repo.BonLivraisonRepository;
import com.esprit.cs.document.repo.BonRetourRepository;
import com.esprit.cs.document.repo.BonTransfertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    @Autowired
    BonTransfertRepository bonTransfertRepository;

    @Autowired
    BonRetourRepository bonRetourRepository;

    @Autowired
    BonLivraisonRepository bonLivraisonRepository;

    public Document createDocument(DocumentType documentType, Document document) throws DocumentException {
        DocumentFactory documentFactory = new DocumentFactory(document);
        switch (documentType) {
            case BT: {
                return bonTransfertRepository.save((BonTransfert) documentFactory.getDocument(DocumentType.BT));
            }
            case BR: {
                return bonRetourRepository.save((BonRetour) documentFactory.getDocument(DocumentType.BR));
            }
            case BL: {
                return bonLivraisonRepository.save((BonLivraison) documentFactory.getDocument(DocumentType.BL));
            }
            default:
                throw new DocumentException("unsupported document type");
        }
    }
}
