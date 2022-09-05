package com.simon.dayoff

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import org.bson.types.ObjectId
import java.time.LocalDateTime


@MappedEntity
@Introspected
class Event(@get:Id @get:GeneratedValue
            var id: ObjectId? = null,
            var startDate: LocalDateTime? = null,
            var endDate: LocalDateTime? = null,
            var status: Status? = null,
            var note: String,
            var requester: People
)
