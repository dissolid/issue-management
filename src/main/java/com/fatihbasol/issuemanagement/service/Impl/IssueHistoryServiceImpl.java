package com.fatihbasol.issuemanagement.service.Impl;

import com.fatihbasol.issuemanagement.entity.Issue;
import com.fatihbasol.issuemanagement.entity.IssueHistory;
import com.fatihbasol.issuemanagement.repository.IssueHistoryRepository;
import com.fatihbasol.issuemanagement.repository.IssueRepository;
import com.fatihbasol.issuemanagement.service.IssueHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class IssueHistoryServiceImpl implements IssueHistoryService {

    private final IssueHistoryRepository issueHistoryRepository;

    public IssueHistoryServiceImpl(IssueHistoryRepository issueHistoryRepository) {
        this.issueHistoryRepository = issueHistoryRepository;
    }



    @Override
    public IssueHistory save(IssueHistory issueHistory) {
        if (issueHistory.getDate()==null){
            throw new IllegalArgumentException("history date cannot be null olamazük.");
        }

        return issueHistoryRepository.save(issueHistory);
    }

    @Override
    public IssueHistory getById(Long Id) {
        return issueHistoryRepository.getOne(Id);
    }

    @Override
    public Page<IssueHistory> getAllPageable(Pageable pageable) {
        return issueHistoryRepository.findAll(pageable);
    }


    @Override
    public Boolean delete(IssueHistory issueHistory) {
        issueHistoryRepository.delete(issueHistory);
        return Boolean.TRUE;
    }


}
