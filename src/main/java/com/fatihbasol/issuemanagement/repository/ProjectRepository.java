package com.fatihbasol.issuemanagement.repository;

import com.fatihbasol.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findByProjectCode(String projectCode);

    Page<Project> findAll(Pageable pageable);

    //List<Project> getByProjectCodeContainsw






}
