# Task Templates

[![CI](https://github.com/codefreak/templates/actions/workflows/main.yml/badge.svg)](https://github.com/codefreak/templates/actions/workflows/main.yml)
[![](https://jitpack.io/v/codefreak/templates.svg)](https://jitpack.io/#codefreak/templates)

These are the task templates for [Code FREAK](https://github.com/codefreak/codefreak). They are available in the user interface under **Task Pool** → **Create Task**. You can also take a look at the code here to get started with task definition files.

Contribution is welcome. **Please open issues in the [main repository](https://github.com/codefreak/codefreak).**

## Contribute a new template
Please create a new directory inside `/templates` with the name corresponding to the programming language name.
The content of the directory should equal to an unpacked task that can be imported into Code FREAK.
After you created the directory please add your template with a human-readable title and a small description to the [`org.codefreak.templates.TaskTemplate`](src/main/java/org/codefreak/templates/TaskTemplate.java) enum.
Please follow [GitHub's official Pull Request guide](https://docs.github.com/en/github/collaborating-with-pull-requests/getting-started/about-collaborative-development-models) on how to contribute your changes to this repository.

## Development

After changing something in this repository, you have to create a new tag in the [releases](https://github.com/codefreak/templates/releases) section. The templates are automatically packaged into a jar by JitPack. You then have to adjust the `com.github.codefreak:templates` dependency version in the [build.gradle](https://github.com/codefreak/codefreak/blob/master/build.gradle) of the main repository accordingly.
