package com.eclipssource.lib.test;

import com.eclipssource.lib.main.Book;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Book_Test {

  private Book book;

  @Before
  public void setUp() {
    book = new Book( "Professional Java for Web Applications" );
  }

  @Test
  public void testBookName() {
    assertEquals( "Professional Java for Web Applications", book.getTitle() );
  }

  @Test
  public void testBookBorrowed() {
    assertEquals( false, book.isBorrowed() );
  }

}
