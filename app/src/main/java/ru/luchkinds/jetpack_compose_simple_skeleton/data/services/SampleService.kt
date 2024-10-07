package ru.luchkinds.jetpack_compose_simple_skeleton.data.services

import retrofit2.http.GET
import ru.luchkinds.jetpack_compose_simple_skeleton.data.entities.SampleDbEntity

interface SampleService {
    @GET("posts")
    suspend fun loadData(): List<SampleDbEntity>
}