package com.eclipssource.lib.test;

import com.eclipssource.lib.main.Book;
import com.eclipssource.lib.main.Library;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.*;

import java.util.List;

public class Library_Test {

  @Test
  public void testBookName() {
    Book book = mock( Book.class );
    when( book.getTitle() )
      .thenReturn( "Professional Java for Web Applications" );
    assertEquals( book.getTitle(), "Professional Java for Web Applications" );
  }

  @Test(expected = ArrayIndexOutOfBoundsException.class)
  public void testForArrayIndexOutOfBoundsException() {
    Library library = mock( Library.class );
    doThrow( new ArrayIndexOutOfBoundsException() ).when( library )
      .getBookList();
    library.getBookList().get( -1 );
  }

  @Test
  public void testVerify() {
    Book book = mock( Book.class );
    when( book.isBorrowed() ).thenReturn( true );
    book.isBorrowed();
    book.isBorrowed();
    verify( book, times( 2 ) ).isBorrowed();
  }

  @Test
  public void testSpy() {
    List list = new Library().getBookList();
    List spy = spy( list );
    doReturn( "Professional Java for Web Applications" ).when( spy ).get( 0 );
    when( spy.get( 0 ) ).thenReturn( "Professional Java for Web Applications" );
  }

}
