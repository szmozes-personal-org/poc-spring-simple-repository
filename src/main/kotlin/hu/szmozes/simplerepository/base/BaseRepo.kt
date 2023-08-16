package hu.szmozes.simplerepository.base

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean
import java.io.Serializable

@NoRepositoryBean
interface BaseRepo<T, ID : Serializable> : JpaRepository<T, ID> {

    fun hhh()
}
