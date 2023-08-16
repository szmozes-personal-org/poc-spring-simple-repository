package hu.szmozes.simplerepository.sample

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(
    private val sampleRepo: SampleRepo,
) {

    @GetMapping("sample")
    fun sample() {
        sampleRepo.hhh()
        val byAa = sampleRepo.findByAa("some aa")
        println(byAa.aa)
    }
}
