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

}
