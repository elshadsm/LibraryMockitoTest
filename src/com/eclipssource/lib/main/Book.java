package com.eclipssource.lib.main;

public class Book {

  String title;
  boolean borrowed;

  public Book( String bookTitle ) {
    this.title = bookTitle;
    this.borrowed = false;
  }

  public void borrowed() {
    this.borrowed = true;
  }

  public void returned() {
    this.borrowed = false;
  }

  public boolean isBorrowed() {
    return this.borrowed;
  }

  public String getTitle() {
    return this.title;
  }

  @Override
  public boolean equals( Object object ) {
    if( object == null ) {
      return false;
    }
    if( !( object instanceof Book ) ) {
      return false;
    }
    Book bookObject = ( Book )object;
    if( this.getTitle() != bookObject.getTitle() ) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return this.getTitle().hashCode();
  }

  @Override
  public String toString() {
    return "Book [title=" + title + ", borrowed=" + borrowed + "]";
  }

}
