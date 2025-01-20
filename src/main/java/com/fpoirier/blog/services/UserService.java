package com.fpoirier.blog.services;

import com.fpoirier.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {

    User getUserById(UUID id);

}
