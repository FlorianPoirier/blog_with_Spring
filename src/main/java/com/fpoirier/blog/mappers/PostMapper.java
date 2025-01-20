package com.fpoirier.blog.mappers;

import com.fpoirier.blog.domain.CreatePostRequest;
import com.fpoirier.blog.domain.UpdatePostRequest;
import com.fpoirier.blog.domain.dtos.CreatePostRequestDto;
import com.fpoirier.blog.domain.dtos.PostDto;
import com.fpoirier.blog.domain.dtos.UpdatePostRequestDto;
import com.fpoirier.blog.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    @Mapping(target = "postStatus", source = "status")
    PostDto toDto(Post post);

    CreatePostRequest toCreatePostRequest(CreatePostRequestDto createPostRequestDto);

    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto updatePostRequestDto);

}
