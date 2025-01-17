/*-
 * #%L
 * TwinColGrid add-on
 * %%
 * Copyright (C) 2017 - 2021 Flowing Code
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.flowingcode.vaadin.addons.twincolgrid;

import java.util.List;

public class Library {

  private final String name;

  private List<Book> books;

  public Library(final String name, final List<Book> books) {
    this.name = name;
    this.books = books;
  }

  public String getName() {
    return name;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(final List<Book> books) {
    this.books = books;
  }
}
