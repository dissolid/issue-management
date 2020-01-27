package com.fatihbasol.issuemanagement.service.Impl;

import com.fatihbasol.issuemanagement.entity.Project;
import com.fatihbasol.issuemanagement.repository.ProjectRepository;
import com.fatihbasol.issuemanagement.service.ProjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project save(Project project) {
        if (project.getProjectCode() == null) {
            throw new IllegalArgumentException("Project code null olamazük.");
        }
        return projectRepository.save(project);
    }

    @Override
    public Project getById(Long Id) {
        return projectRepository.getOne(Id);
    }

    @Override
    public List<Project> getByProjectCode(String projectCode) {
        return projectRepository.findByProjectCode(projectCode);
    }

    @Override
    public List<Project> getByProjectCodeContains(String projectCode) {
        return null;
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {
        return projectRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(Project project) {
        projectRepository.delete(project);
        return Boolean.TRUE;
    }
}
