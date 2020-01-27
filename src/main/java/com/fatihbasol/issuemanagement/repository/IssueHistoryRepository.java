package com.fatihbasol.issuemanagement.repository;

import com.fatihbasol.issuemanagement.entity.IssueHistory;
import com.fatihbasol.issuemanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long> {
}
