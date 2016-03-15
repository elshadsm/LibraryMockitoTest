package com.eclipssource.lib.test;

import com.eclipssource.lib.main.Book;
import com.eclipssource.lib.main.Library;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.*;

import java.util.List;

public class Library_Test {

  private Library library;

  @Before
  public void setUp() {
    library = new Library( "9:00 - 18:00", "Baku, Babak avenue, 90" );
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testForIndexOutOfBoundsException() {
    library.getBookList().get( 0 );
  }

  @Test
  public void testOpeningHours() {
    assertEquals( "9:00 - 18:00", library.getOpeningHours() );
  }

  @Test
  public void testAddress() {
    assertEquals( "Baku, Babak avenue, 90", library.getAddress() );
  }

  @Test
  public void testAvailableBook() {
    Book book = mock( Book.class );
    when( book.getTitle() )
      .thenReturn( "Professional Java for Web Applications" );
    when( book.isBorrowed() ).thenReturn( false );
    library.getBookList().add( book );
    assertEquals( book,
                  library
                    .getAvailableBook( "Professional Java for Web Applications" ) );
  }
  //
  // @Test
  // public void testVerify() {
  // Book book = mock( Book.class );
  // when( book.isBorrowed() ).thenReturn( true );
  // book.isBorrowed();
  // book.isBorrowed();
  // verify( book, times( 2 ) ).isBorrowed();
  // }

  // @Test
  // public void testSpy() {
  // List list = new Library().getBookList();
  // List spy = spy( list );
  // doReturn( "Professional Java for Web Applications" ).when( spy ).get( 0 );
  // when( spy.get( 0 ) ).thenReturn( "Professional Java for Web Applications"
  // );
  // }

}
