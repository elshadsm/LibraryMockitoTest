package com.eclipssource.lib.main;

import java.util.ArrayList;
import java.util.List;

public class Library {

  private List<Book> bookList = new ArrayList<>();

  public List<Book> getBookList() {
    return bookList;
  }

  public void setBookList( List<Book> bookList ) {
    this.bookList = bookList;
  }

  public static void main( String[] args ) {
    // System.out.println( bookList.get( -1 ));
  }

}
