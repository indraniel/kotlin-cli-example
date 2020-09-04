# A Simple Kotlin CLI Example

Based on reading: 

* [Kotlin Beginner to Advance: Build A Command Line Tool without using any third-party library][0]
* [CLI KT Quickstart][1]

## Setup

```
$ git clone https://github.com/indraniel/kotlin-cli-example
$ ./gradlew clean jar

$ java -jar build/libs/kotlin-cli-example.jar --help
Usage: app [OPTIONS]

Options:
  -h, --help  Show this message and exit

$ java -jar build/libs/kotlin-cli-example.jar
Hello World!
```

[0]: https://medium.com/@deepak_v/kotlin-beginner-to-advance-build-real-command-line-tool-using-kotlinx-cli-608bbc6d9a3
[1]: https://ajalt.github.io/clikt/quickstart
