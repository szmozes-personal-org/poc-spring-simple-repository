package hu.szmozes.simplerepository

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleRepositoryApplication

fun main(args: Array<String>) {
    runApplication<SimpleRepositoryApplication>(*args)
}
