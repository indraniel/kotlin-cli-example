/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package example

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.output.TermUi

class App: CliktCommand() {
    override fun run() {
        echo("Hello World!")
    }
}

fun main(args: Array<String>) {
    App().main(args)
}