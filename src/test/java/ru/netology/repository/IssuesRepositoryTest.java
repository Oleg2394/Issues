package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Issue;
import java.util.ArrayList;
import java.util.Collection;

class IssuesRepositoryTest {
    private IssuesRepository repository = new IssuesRepository();

    @Test
    void shouldAddIssue() {
        repository.add(new Issue());
    }

    @Test
    void shouldAddMultipleIssue() {
        Collection<Issue> issues = new ArrayList<>();
        issues.add(new Issue());
        issues.add(new Issue());
        repository.addAll(issues);
    }

}