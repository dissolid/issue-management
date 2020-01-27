package com.fatihbasol.issuemanagement.repository;

import com.fatihbasol.issuemanagement.dto.IssueDto;
import com.fatihbasol.issuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IssueRepository extends JpaRepository<Issue, Long> {

}
