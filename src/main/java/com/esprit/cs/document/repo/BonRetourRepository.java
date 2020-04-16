package com.esprit.cs.document.repo;

import com.esprit.cs.document.model.BonRetour;

import javax.transaction.Transactional;

@Transactional
public interface BonRetourRepository extends DocumentRepository<BonRetour> {
}
