package org.codefreak.templates;

import java.io.InputStream;

public enum TaskTemplate {
  CPP("C++", "Google Test (gtest), cpplint"),
  CSHARP("C#", ".NET, NUnit, dotnet-format"),
  JAVA("Java", "JUnit, Checkstyle"),
  JAVASCRIPT("JavaScript (Node)", "Jest, ESLint"),
  PYTHON("Python", "Pytest, Pylint");

  private final String title;
  private final String description;

  TaskTemplate(String title, String description) {
    this.title = title;
    this.description = description;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public String getArchiveFileBaseName() {
    return name().toLowerCase() + ".tar";
  }

  public InputStream getArchiveStream() throws IllegalStateException {
    InputStream archiveStream = this.getClass().getResourceAsStream(getArchiveFileBaseName());
    if (archiveStream == null) {
      throw new IllegalStateException("Could not read template archive from " + getArchiveFileBaseName());
    }
    return archiveStream;
  }
}
