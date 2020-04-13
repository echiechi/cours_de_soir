package com.esprit.cs.document.controller;

import com.esprit.cs.document.model.Document;
import com.esprit.cs.document.repo.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DocumentController {

    @Autowired
    DocumentRepository documentRepository;

    @GetMapping("documents")
    List<Document> fetchDocuments() {
        return documentRepository.findAll();
    }

    @PostMapping("documents")
    Document addDocument(@RequestBody Document document) {
        return documentRepository.save(document);
    }

    @DeleteMapping("documents/{id}")
    Document deleteDocumentById(@PathVariable Long id) {
        Document doc = documentRepository.findById(id).get();
        documentRepository.delete(doc);
        return doc;
    }

}
