package hu.szmozes.simplerepository.base

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean
import java.util.*

@NoRepositoryBean
interface BaseRepo<T> : JpaRepository<T, UUID> {

    fun hhh()
}
