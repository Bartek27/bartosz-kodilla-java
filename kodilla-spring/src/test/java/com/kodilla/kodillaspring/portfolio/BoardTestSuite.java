package com.kodilla.kodillaspring.portfolio;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.kodillaspring");
        Board board = context.getBean(Board.class);

        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();

        toDoList.addTaskTotheList("kill the wolf");
        inProgressList.addTaskTotheList("take the basket to grandma");
        doneList.addTaskTotheList("pass through the forest");

        //When
        String toDoTask = toDoList.getTaskFromTheList(0);
        String inProgressTask = inProgressList.getTaskFromTheList(0);
        String doneTask = doneList.getTaskFromTheList(0);

        //Then
        assertEquals("kill the wolf", toDoTask);
        assertEquals("take the basket to grandma", inProgressTask);
        assertEquals("pass through the forest", doneTask);
    }
}
