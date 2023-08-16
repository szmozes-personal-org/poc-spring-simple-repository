package hu.szmozes.simplerepository.base

import jakarta.persistence.EntityManager
import org.springframework.data.jpa.repository.support.JpaEntityInformation
import org.springframework.data.jpa.repository.support.SimpleJpaRepository
import org.springframework.data.repository.NoRepositoryBean
import java.util.*

@NoRepositoryBean
class BaseRepoImpl<T> : BaseRepo<T>, SimpleJpaRepository<T, UUID> {

    constructor(domainClass: Class<T>, em: EntityManager) : super(domainClass, em)

    constructor(entityInformation: JpaEntityInformation<T, *>, entityManager: EntityManager) : super(
        entityInformation,
        entityManager
    )

//    override fun printHehe() {
//        println("hehe")
//    }
}
