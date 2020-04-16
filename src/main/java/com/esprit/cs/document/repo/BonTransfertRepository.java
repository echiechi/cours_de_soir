package com.esprit.cs.document.repo;

import com.esprit.cs.document.model.BonTransfert;

import javax.transaction.Transactional;

@Transactional
interface BonTransfertRepository extends DocumentRepository<BonTransfert> {
}
