package com.fatihbasol.issuemanagement.service.Impl;

import com.fatihbasol.issuemanagement.entity.User;
import com.fatihbasol.issuemanagement.repository.UserRepository;
import com.fatihbasol.issuemanagement.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        if (user.getEmail() == null) {
            throw new IllegalArgumentException("User email null olamazük.");
        }
        return userRepository.save(user);
    }

    @Override
    public User getById(Long Id) {
        return userRepository.getOne(Id);
    }

    @Override
    public User getByUserName(String name) {
        return userRepository.getByUserName(name);
    }

    @Override
    public Page<User> getAllPageable(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(User user) {
        userRepository.delete(user);
        return Boolean.TRUE;
    }
}
