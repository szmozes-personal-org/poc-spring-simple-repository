package hu.szmozes.simplerepository.sample

import hu.szmozes.simplerepository.base.BaseRepo
import java.util.*

interface SampleRepo : BaseRepo<SampleEntity, UUID> {

    fun findByAa(aa: String): SampleEntity
}
