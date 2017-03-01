package com.simplon;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibrarypartIITest {

    Library library = new Library(15);
    Worker worker = new Worker("Marcel",8);

    @Test
    public void TestBooks() {
        //set
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("l'Univers elegant", 40));

        // test
        ArrayList<Book> result = library.putBooks(books,worker);

        //assert
        assertEquals(1, result.size());

    }

    @Test
    public void TestCDs() {
        //set
        ArrayList<CD> cds = new ArrayList<CD>();
        cds.add(new CD("Aja", 45));

        // test
        ArrayList<CD> result = library.putCDs(cds,worker);

        //assert
        assertEquals(1, result.size());

    }

    @Test
    public void addLibrary_4() {
        //set
        ArrayList<DVD> dvds = new ArrayList<DVD>();
        library = new Library(15);

        dvds.add(new DVD("dvd", 120, Movie.HORROR, false,1));
        dvds.add(new DVD("Brasil", 120, Movie.FUN, false,2));
        dvds.add(new DVD("Xanadu", 90, Movie.MUSICAL, false,2));

        // test
        ArrayList<DVD> result = library.putDvds(dvds,worker);

        //assert
        assertTrue(result.size() <= 3);

        dvds.add(new DVD("Mars", 120, Movie.ACTION, true,3));
        dvds.add(new DVD("Les 3 frères", 90, Movie.FUN, false,2));
        dvds.add(new DVD("Rambot", 90, Movie.ACTION, false,2));
        dvds.add(new DVD("Fame", 90, Movie.MUSICAL, false,2));

        // test
        result = library.putDvds(dvds,worker);

        //assert
        assertEquals(3, result.size());
    }

    @Test
    public void TestSameDVD() {
        //set
        ArrayList<DVD> result;
        ArrayList<DVD> dvds = new ArrayList<DVD>();
        library = new Library(15);
        dvds.add(new DVD("dvd", 120, Movie.HORROR, false,1));

        //test
        result = library.putDvds(dvds,worker); // Le libraire à 1DVD

        //assert
        assertTrue(result.size() <= 3);

        //set new dvds
        dvds.remove(0);     // retire le dvd du libraire
        dvds.add(new DVD("Shyning", 120, Movie.HORROR, false,1));
        dvds.add(new DVD("dvd", 120, Movie.HORROR, false,1));
        dvds.add(new DVD("Mairie à tout prie", 100, Movie.FUN, false,2));
        dvds.add(new DVD("Newyork-Newyork", 90, Movie.MUSICAL, false,2));

        // test si 1 DVD est identique
        result = library.putDvds(dvds,worker);

        //assert
        assertEquals(1, result.size());
    }

    @Test
    public void Worker_put_Books() {
        //set
        Library library = new Library(11);
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("l'Univers elegant", 400));
        books.add(new Book("livre2", 40));
        books.add(new Book("livre3", 50));
        worker.putBooks(books);

        // test
        ArrayList<Book> result = library.putBooks(null,worker);

        //assert
        assertEquals(3, result.size());

    }

}