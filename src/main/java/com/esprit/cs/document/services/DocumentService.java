package com.esprit.cs.document.services;

import com.esprit.cs.document.model.factory.DocumentFactory;
import com.esprit.cs.document.exceptions.DocumentException;
import com.esprit.cs.document.model.Document;
import com.esprit.cs.document.model.enums.DocumentType;
import com.esprit.cs.document.repo.DocumentRepositoryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepositoryFactory documentRepositoryFactory;

    public Document createDocument(DocumentType documentType, Document document) throws DocumentException {
        DocumentFactory documentFactory = new DocumentFactory(document);
        return (Document) documentRepositoryFactory.getRepository(documentType).save(documentFactory.getDocument(documentType));
    }
}
