package com.FullStack.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.FullStack.onlinebookstore.entity.BookCatagory;

@RepositoryRestResource(collectionResourceRel = "BookCatagory", path = "Book-catagory")
public interface BookCatagoryRepository extends JpaRepository<BookCatagory, Long>{
	/*
	 * Done with this.We don't need to create a controller.Get mapping,Put
	 * mapping,Post mapping. The spring dataRest will take care of evertthing.It
	 * will create a REST end point based on entity name.
	 */
}





