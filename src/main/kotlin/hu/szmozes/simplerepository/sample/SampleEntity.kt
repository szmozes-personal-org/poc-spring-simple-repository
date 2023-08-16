package hu.szmozes.simplerepository.sample

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
class SampleEntity {

    @Id
    val id: UUID = UUID.randomUUID()

    var aa: String? = null

    var bb: String? = null
}
