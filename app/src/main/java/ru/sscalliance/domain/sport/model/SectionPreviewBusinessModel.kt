package ru.sscalliance.domain.sport.model

import ru.sscalliance.domain.section.model.SectionType

data class SectionPreviewBusinessModel(
    var title: String = "",
    val type: SectionType
)
