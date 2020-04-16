package com.esprit.cs.document.controller;

import com.esprit.cs.document.exceptions.DocumentException;
import com.esprit.cs.document.model.BonRetour;
import com.esprit.cs.document.model.BonTransfert;
import com.esprit.cs.document.model.Document;
import com.esprit.cs.document.model.enums.DocumentType;
import com.esprit.cs.document.repo.BonLivraisonRepository;
import com.esprit.cs.document.repo.BonRetourRepository;
import com.esprit.cs.document.repo.BonTransfertRepository;
import com.esprit.cs.document.services.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DocumentController {


    @Autowired
    DocumentService documentService;

    @PostMapping("documents/{type}")
    Document addDocument(@RequestBody Document document, @PathVariable("type") DocumentType documentType) {
        try {
            return documentService.createDocument(documentType, document);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return null;
    }

}
