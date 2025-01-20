package com.fpoirier.blog.repositories;

import com.fpoirier.blog.domain.PostStatus;
import com.fpoirier.blog.domain.entities.Category;
import com.fpoirier.blog.domain.entities.Post;
import com.fpoirier.blog.domain.entities.Tag;
import com.fpoirier.blog.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {

    List<Post> findAllByStatusAndCategoryAndTagsContaining(PostStatus status, Category category, Tag tag);
    List<Post> findAllByStatusAndCategory(PostStatus status, Category category);
    List<Post> findAllByStatusAndTagsContaining(PostStatus status, Tag tag);
    List<Post> findAllByStatus(PostStatus postStatus);
    List<Post> findAllByAuthorAndStatus(User author, PostStatus postStatus);

}
