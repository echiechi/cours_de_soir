package com.esprit.cs.document.services;

import com.esprit.cs.document.model.factory.DocumentFactory;
import com.esprit.cs.document.exceptions.DocumentException;
import com.esprit.cs.document.model.Document;
import com.esprit.cs.document.model.enums.DocumentType;
import com.esprit.cs.document.repo.DocumentRepositoryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepositoryFactory documentRepositoryFactory;

    public Document createDocument(DocumentType documentType, Document document) throws DocumentException {
        DocumentFactory documentFactory = new DocumentFactory(document);
        return (Document) documentRepositoryFactory.getRepository(documentType).save(documentFactory.getDocument(documentType));
    }

    public Document updateDocument(Document document, String id) throws DocumentException {
        DocumentFactory documentFactory = new DocumentFactory(document);
        Document d = documentFactory.getDocumentWithId(document.getType(), id);
        return (Document) documentRepositoryFactory.getRepository(document.getType())
                .save(d);
    }

    public List<Document> getDocuments() throws DocumentException {
        return (List<Document>) documentRepositoryFactory.getRepository(DocumentType.values()[0]).findAll();
    }

    public void deleteDocument(String id, DocumentType type) throws DocumentException {
        documentRepositoryFactory.getRepository(type).delete(id);
    }
}
