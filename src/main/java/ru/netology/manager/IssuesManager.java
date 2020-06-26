package ru.netology.manager;

import ru.netology.domain.Issue;
import ru.netology.repository.IssuesRepository;

import java.util.*;
import java.util.function.Predicate;

public class IssuesManager {
    private IssuesRepository repository;

    public IssuesManager(IssuesRepository repository) {
        this.repository = repository;
    }

    public List<Issue> filterBy(Predicate<Issue> predicate) {
        List<Issue> result = new ArrayList<>();
        for (Issue issue : repository.getAll()) {
            if (predicate.test(issue)) {
                result.add(issue);
            }
        }
        return sort(result);
    }

    public List<Issue> sort(List<Issue> exist) {
        exist.sort(Comparator.comparing(Issue::getDateOfChange).reversed());
        return exist;
    }
}