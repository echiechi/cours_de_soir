package com.esprit.cs.document.repo;

import com.esprit.cs.document.model.Document;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface DocumentRepository<T extends Document> extends CrudRepository<T, Long> {
}