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

# Other Useful References

* [How to create the far jar with gradle kotlin script][2]
* https://github.com/wadejensen/kotlin-fat-jar-example
* [Building an all-in-one Jar in Gradle with the Kotlin DSL][3]

[0]: https://medium.com/@deepak_v/kotlin-beginner-to-advance-build-real-command-line-tool-using-kotlinx-cli-608bbc6d9a3
[1]: https://ajalt.github.io/clikt/quickstart
[2]: https://stackoverflow.com/questions/41794914/how-to-create-the-fat-jar-with-gradle-kotlin-script
[3]: https://www.artificialworlds.net/blog/2019/07/12/building-an-all-in-one-jar-in-gradle-with-the-kotlin-dsl/
