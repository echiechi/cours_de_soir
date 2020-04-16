package com.esprit.cs.document.repo;

import com.esprit.cs.document.model.BonLivraison;

import javax.transaction.Transactional;

@Transactional
public interface BonLivraisonRepository extends DocumentRepository<BonLivraison> {
}
