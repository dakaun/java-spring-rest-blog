package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Author;
import com.pluralsight.blog.model.Post;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import java.lang.String;

@Component
public interface PostRepository extends JpaRepository<Post, Long>{
	
	@RestResource(rel="contains-title", path="containsTitle")
	List<Post> findByTitleContaining(String title);
	//@RestResource(rel="contains-lastname", path="containsLastname")
	List<Post> findByAuthor_Lastname(String lastname);
}