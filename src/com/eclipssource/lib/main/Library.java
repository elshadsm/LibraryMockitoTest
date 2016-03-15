package com.eclipssource.lib.main;

import java.util.ArrayList;
import java.util.List;

public class Library {

  public Library( String openingHours, String address ) {
    super();
    this.openingHours = openingHours;
    this.address = address;
  }
  private List<Book> bookList = new ArrayList<>();
  private String openingHours;
  private String address;

  public List<Book> getBookList() {
    return bookList;
  }

  public String getOpeningHours() {
    return openingHours;
  }

  public String getAddress() {
    return address;
  }

  public Book getAvailableBook( String title ) {
    for( Book innerBook : this.bookList ) {
      if( title.equals( innerBook.getTitle() ) && !innerBook.isBorrowed() ) {
        return innerBook;
      }
    }
    return null;
  }

  public static void main( String[] args ) {
    System.out.println( new Library( "", "" ).getBookList().get( 0 ) );
  }

}
