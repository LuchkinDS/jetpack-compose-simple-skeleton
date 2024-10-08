package ru.luchkinds.jetpack_compose_simple_skeleton.data.db

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import ru.luchkinds.jetpack_compose_simple_skeleton.data.entities.SampleDbEntity

@Dao
interface SampleDao {
    @Query("select * from table_name")
    fun getRows(): Flow<List<SampleDbEntity>>
}