package com.bagus.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bagus.library.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

}