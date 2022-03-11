package com.kodilla.testing.collection;
import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.util.*;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("TEST1")

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> myList = new ArrayList<>();

        //When

        ArrayList<Integer> resultList = (ArrayList<Integer>) oddNumbersExterminator.exterminate(myList);

        //Then
        Assert.assertEquals(0, resultList.size());

    }

    @DisplayName("TEST2")

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> myList2 = new ArrayList<>();
        myList2.add(1);
        myList2.add(2);
        myList2.add(3);
        myList2.add(7);
        myList2.add(37);
        myList2.add(57);
        myList2.add(77);

        //When
        ArrayList<Integer> resultList = (ArrayList<Integer>) oddNumbersExterminator.exterminate(myList2);

        //Then
        Assert.assertEquals(1, resultList.size());
    }
}
