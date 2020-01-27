package com.fatihbasol.issuemanagement.service;

import com.fatihbasol.issuemanagement.entity.Issue;
import com.fatihbasol.issuemanagement.entity.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueHistoryService {
    IssueHistory save(IssueHistory issueHistory);

    IssueHistory getById(Long Id);

    Page<IssueHistory> getAllPageable(Pageable pageable);

    Boolean delete(IssueHistory issueHistory);

}
