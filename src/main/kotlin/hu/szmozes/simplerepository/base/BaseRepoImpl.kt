package hu.szmozes.simplerepository.base

import jakarta.persistence.EntityManager
import org.springframework.data.jpa.repository.support.JpaEntityInformation
import org.springframework.data.jpa.repository.support.SimpleJpaRepository
import java.io.Serializable

class BaseRepoImpl<T, ID : Serializable> : SimpleJpaRepository<T, ID>, BaseRepo<T, ID> {

//    constructor(domainClass: Class<T>, em: EntityManager) : super(domainClass, em)

    constructor(entityInformation: JpaEntityInformation<T, *>, entityManager: EntityManager) : super(
        entityInformation,
        entityManager
    )

    override fun hhh() {
        println("hhh")
    }

}
