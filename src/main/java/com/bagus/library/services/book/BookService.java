package com.bagus.library.services.book;

import com.bagus.library.payloads.requests.BookRequest;
import com.bagus.library.payloads.responses.Response;

public interface BookService {
  Response addBook(BookRequest request);

  Response getBooks();

  Response getBookById(String uuid);

  Response updateBookById(String uuid, BookRequest request);

  Response deleteBookById(String uuid);
}