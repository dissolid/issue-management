package com.fatihbasol.issuemanagement.service;

import com.fatihbasol.issuemanagement.dto.IssueDto;
import com.fatihbasol.issuemanagement.entity.Issue;
import com.fatihbasol.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long Id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issue);

}
