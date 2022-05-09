package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() throws Exception {

        //Given
        Library library = new Library("School library");
        Book book1 = new Book("Book1", "Author1", LocalDate.of(1995, 3, 12));
        Book book2 = new Book("Book2", "Author2", LocalDate.of(1990, 5, 14));
        Book book3 = new Book("Book3", "Author3", LocalDate.of(1997, 8, 21));
        Book book4 = new Book("Book4", "Author4", LocalDate.of(1998, 9, 22));
        //When
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book4);
        library.getBooks().add(book3);

        Library clonedLibrary = null;

        clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("City library");

        Library deepClonedLibrary = null;
        deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("Voivodeship library");


        library.getBooks().remove(book1);
        //Then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
    }
}
