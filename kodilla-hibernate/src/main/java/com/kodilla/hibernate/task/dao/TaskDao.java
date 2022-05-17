package com.kodilla.hibernate.task.dao;

import javax.persistence.*;
import javax.transaction.Transactional;
import com.kodilla.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Transactional
    @Repository
    public interface TaskDao extends CrudRepository<Task, Integer> {
        List<Task> findByDuration(int duration);
    }

