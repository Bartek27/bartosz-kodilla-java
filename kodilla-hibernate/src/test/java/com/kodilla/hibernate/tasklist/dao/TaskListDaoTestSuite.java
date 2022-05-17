package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Example Name", "Example Description");
        taskListDao.save(taskList);
        String expected = "Example Description";
        //When
        List<TaskList> searchedTaskList = taskListDao.findByListName("Example Name");
        String actual = searchedTaskList.get(0).getDescription();
        //Then
        assertEquals(expected, actual);
        //Clean up
        taskListDao.delete(taskList);
    }

}

