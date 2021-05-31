package com.freedom.petfinder.common.data.api.model.mappers

import com.freedom.petfinder.common.data.api.model.ApiAnimal
import com.freedom.petfinder.common.domain.animal.Age
import com.freedom.petfinder.common.domain.animal.Animal
import java.util.*

class ApiAnimalMapper: ApiMapper<ApiAnimal, Animal> {

    override fun mapToDomain(apiEntity: ApiAnimal): Animal {
        return Animal(
            id = apiEntity?.id!!,
            name = apiEntity.name.orEmpty(), // 2
            type = apiEntity.type.orEmpty(),
            details = parseAnimalDetails(apiEntity), // 3
            media = mapMedia(apiEntity),
            tags = apiEntity.tags.orEmpty().map { it.orEmpty() },
            adoptionStatus = parseAdoptionStatus(apiEntity.status),
            publishedAt = DateTimeUtils.parse(apiEntity.publishedAt.orEmpty()) // 4
        )
    }

    private fun parseAnimalDetails(apiAnimal: ApiAnimal): Details {
        return Details(
            description = apiAnimal.description.orEmpty(),
            age = parseAge(apiAnimal.age),
            species = apiAnimal.species.orEmpty(),
            breed = apiBreedsMapper.mapToDomain(apiAnimal.breeds),
            colors = apiColorsMapper.mapToDomain(apiAnimal.colors),
            gender = parserGender(apiAnimal.gender),
            size = parseSize(apiAnimal.size),
            coat = parseCoat(apiAnimal.coat),
            healthDetails = apiHealthDetailsMapper.mapToDomain(apiAnimal.attributes),
            habitatAdaptation = apiHabitatAdaptationMapper.mapToDomain(apiAnimal.environment),
            organization = mapOrganization(apiAnimal)
        )
    }


    private fun parseAge(age: String?): Age {
        if (age.isNullOrEmpty()) return Age.UNKNOWN

        // will throw IllegalStateException if the string does not match any enum value
        return Age.valueOf(age.toUpperCase(Locale.ROOT))
    }

}