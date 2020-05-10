package com.FullStack.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FullStack.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
//Spring  Data Rest supports pagination, Searching and support by default
}
