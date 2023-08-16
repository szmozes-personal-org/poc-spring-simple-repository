package hu.szmozes.simplerepository.base

import jakarta.persistence.EntityManager
import org.springframework.data.jpa.repository.support.SimpleJpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class BaseRepoImpl<T>(domainClass: Class<T>, em: EntityManager) : BaseRepo<T>,
    SimpleJpaRepository<T, UUID>(domainClass, em) {

    override fun hhh() {
        println("hhh")
    }

}
