package hu.szmozes.simplerepository.sample

import hu.szmozes.simplerepository.base.BaseRepo

interface SampleRepo : BaseRepo<SampleEntity> {

    fun findByAa(aa: String): SampleEntity?
}
