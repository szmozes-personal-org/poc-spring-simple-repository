package hu.szmozes.simplerepository.sample

import hu.szmozes.simplerepository.base.HhhPrinter
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface SampleRepo : JpaRepository<SampleEntity, UUID>, HhhPrinter {

    fun findByAa(aa: String): SampleEntity
}
