package com.esprit.cs.document.model.factory;

import com.esprit.cs.document.exceptions.DocumentException;
import com.esprit.cs.document.model.BonLivraison;
import com.esprit.cs.document.model.BonRetour;
import com.esprit.cs.document.model.BonTransfert;
import com.esprit.cs.document.model.Document;
import com.esprit.cs.document.model.enums.DocumentType;

public class DocumentFactory {

    private Document document;

    public DocumentFactory(Document document) {
        this.document = document;
    }

    public Document getDocument(DocumentType documentType) throws DocumentException {
        switch (documentType) {
            case BT: {
                BonTransfert bt = new BonTransfert();
                bt.setDate(document.getDate());
                bt.setQuantity(document.getQuantity());
                return bt;
            }
            case BL: {
                BonLivraison bl = new BonLivraison();
                bl.setDate(document.getDate());
                bl.setQuantity(document.getQuantity());
                return bl;
            }
            case BR: {
                BonRetour br = new BonRetour();
                br.setDate(document.getDate());
                br.setQuantity(document.getQuantity());
                return br;
            }
            default:
                throw new DocumentException("unsupported document type");
        }
    }

    public Document getDocumentWithId(DocumentType documentType, String id) throws DocumentException {
        switch (documentType) {
            case BT: {
                BonTransfert bt = new BonTransfert();
                bt.setId(id);
                bt.setDate(document.getDate());
                bt.setQuantity(document.getQuantity());
                return bt;
            }
            case BL: {
                BonLivraison bl = new BonLivraison();
                bl.setId(id);
                bl.setDate(document.getDate());
                bl.setQuantity(document.getQuantity());
                return bl;
            }
            case BR: {
                BonRetour br = new BonRetour();
                br.setId(id);
                br.setDate(document.getDate());
                br.setQuantity(document.getQuantity());
                return br;
            }
            default:
                throw new DocumentException("unsupported document type");
        }
    }

}
