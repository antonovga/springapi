package com.antonovga.springapi.repos;

import com.antonovga.springapi.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PostRepo extends CrudRepository<Post, UUID> {

}