package org.codefreak.templates;

import java.io.InputStream;

public enum TaskTemplate {
  CPP("C++"),
  CSHARP("C# (.Net)"),
  JAVA("Java"),
  JAVASCRIPT("JavaScript (Node)"),
  PYTHON("Python");

  private final String title;

  TaskTemplate(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
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
