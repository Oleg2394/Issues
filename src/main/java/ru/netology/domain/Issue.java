package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Issue {
    private int id;
    private String author;
    private HashSet<String> assignee;
    private String content;
    private HashSet<String> label;
    private boolean open;
    private String dateOfChange;
}
