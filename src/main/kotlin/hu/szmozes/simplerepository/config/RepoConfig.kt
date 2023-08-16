package hu.szmozes.simplerepository.config

import hu.szmozes.simplerepository.base.BaseRepoImpl
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories(
    repositoryBaseClass = BaseRepoImpl::class,
    basePackages = ["hu.szmozes.simplerepository"]
)
class RepoConfig
