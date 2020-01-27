package com.fatihbasol.issuemanagement.service.Impl;

import com.fatihbasol.issuemanagement.dto.IssueDto;
import com.fatihbasol.issuemanagement.entity.Issue;
import com.fatihbasol.issuemanagement.repository.IssueRepository;
import com.fatihbasol.issuemanagement.service.IssueService;
import com.fatihbasol.issuemanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper) {
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public IssueDto save(IssueDto issueDto) {
        if (issueDto.getDate() == null) {
            throw new IllegalArgumentException("Issue date cannot be null");
        }

        Issue issueMap = modelMapper.map(issueDto, Issue.class);
        issueMap = issueRepository.save(issueMap);
        return modelMapper.map(issueMap,IssueDto.class);
    }

    @Override
    public IssueDto getById(Long Id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {
        Page<Issue> data =issueRepository.findAll(pageable);
        TPage page = new TPage<IssueDto>();
        IssueDto[] dtos = modelMapper.map(data.getContent(),IssueDto[].class);
        page.setStat(data,Arrays.asList(dtos));
        return page;
    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
}
