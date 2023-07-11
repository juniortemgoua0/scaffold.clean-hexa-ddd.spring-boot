package com.example.springbootscaffold.feature.catalogue.domain.entities;

/**
 * .
 */
public class Category {

  private String title;

  public Category() {
  }

  public static Category builder() {
    return new Category();
  }

  public Category build() {
    return this;
  }

  public String getTitle() {
    return title;
  }

  public Category setTitle(String title) {
    this.title = title;
    return this;
  }

}