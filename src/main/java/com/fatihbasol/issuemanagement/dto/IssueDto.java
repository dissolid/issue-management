package com.fatihbasol.issuemanagement.dto;

import lombok.Data;

import java.util.Date;

@Data
public class IssueDto {
    private Long id;
    private String description;
    private String details;
    private Date date;
    private String issueStatus;
    private UserDto assignee;
    private ProjectDto project;

}
