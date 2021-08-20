package org.codefreak.templates;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskTemplateTest {
  private final File templateRootDir = Paths.get(System.getProperty("user.dir")).resolve("templates").toFile();

  @Test
  public void testAllTemplateDirsHaveEnumDefined() {
    for (File dir : Objects.requireNonNull(templateRootDir.listFiles())) {
      String dirName = dir.getName();
      String expectedEnumName = dirName.toUpperCase();
      assertDoesNotThrow(() -> {
        TaskTemplate.valueOf(expectedEnumName);
      }, "There is no enum in TaskTemplate defined for template directory " + dirName + " (expected enum name is " + expectedEnumName + ")");
    }
  }

  @Test
  public void testAllEnumsHaveTemplatesDefined() {
    List<String> dirNames = Arrays.asList(templateRootDir.list());
    for (TaskTemplate definedTemplate : TaskTemplate.values()) {
      String expectedDirName = definedTemplate.name().toLowerCase();
      assertTrue(dirNames.contains(expectedDirName), "There is a template " + definedTemplate.name() + " defined but not matching template dir exists (expected template directory name is " + expectedDirName + ").");
    }
  }

  @Test
  public void testAllArchiveStreamsHaveBeenBuilt() {
    for (TaskTemplate definedTemplate : TaskTemplate.values()) {
      assertDoesNotThrow(() -> {
        definedTemplate.getArchiveStream().close();
      });
    }
  }
}
