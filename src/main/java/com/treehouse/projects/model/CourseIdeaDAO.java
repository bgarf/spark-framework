package com.treehouse.projects.model;

import java.util.List;

public interface CourseIdeaDAO {
    boolean add(CourseIdea idea);

    List<CourseIdea> findAll();
}
