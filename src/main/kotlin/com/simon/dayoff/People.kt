package com.simon.dayoff

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.serde.annotation.Serdeable
import org.bson.types.ObjectId
import java.time.LocalDateTime


@Serdeable
@Introspected
class People(
//             var id: ObjectId? = null,
             var startDate: LocalDateTime? = null,
             var endDate: LocalDateTime? = null,
             var firstName: String,
             var lastName: String,
             var company: String,
             var employeeKind: EmployKind,
             var matriculeAccount: String? = null
)
