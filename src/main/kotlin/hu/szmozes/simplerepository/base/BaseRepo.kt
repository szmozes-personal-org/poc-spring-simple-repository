package hu.szmozes.simplerepository.base

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation
import org.springframework.data.repository.NoRepositoryBean
import java.util.*

@NoRepositoryBean
interface BaseRepo<T> : JpaRepositoryImplementation<T, UUID> {

//    fun printHehe()
}