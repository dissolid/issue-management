package com.fatihbasol.issuemanagement.service;

import com.fatihbasol.issuemanagement.entity.Issue;
import com.fatihbasol.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {
    Project save(Project project);

    Project getById(Long Id);

    List<Project> getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);


    Page<Project> getAllPageable(Pageable pageable);

    Boolean delete(Project project);

}
