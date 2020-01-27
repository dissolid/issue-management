package com.fatihbasol.issuemanagement.service;

import com.fatihbasol.issuemanagement.entity.Issue;
import com.fatihbasol.issuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    User save(User user);

    User getById(Long Id);

    User getByUserName(String name);

    Page<User> getAllPageable(Pageable pageable);

    Boolean delete(User user);


}
