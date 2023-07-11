package com.example.springbootscaffold.feature.catalogue.domain.entities;

/**
 * .
 */
public class Collection {

  private String title;

  public Collection() {
  }

  public static Collection builder() {
    return new Collection();
  }

  public Collection build() {
    return this;
  }

  public String getTitle() {
    return title;
  }

  public Collection setTitle(String title) {
    this.title = title;
    return this;
  }
}