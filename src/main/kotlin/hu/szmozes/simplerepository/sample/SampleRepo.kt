package hu.szmozes.simplerepository.sample

import hu.szmozes.simplerepository.base.BaseRepo
import hu.szmozes.simplerepository.base.HehePrinter
import org.springframework.stereotype.Repository

@Repository
interface SampleRepo : BaseRepo<SampleEntity>, HehePrinter {

    fun findByAa(aa: String): SampleEntity
}
