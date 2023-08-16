package hu.szmozes.simplerepository.sample

import hu.szmozes.simplerepository.base.BaseRepo
import org.springframework.stereotype.Repository

@Repository
interface SampleRepo : BaseRepo<SampleEntity>
{
    fun findByAa(aa: String): SampleEntity

}
