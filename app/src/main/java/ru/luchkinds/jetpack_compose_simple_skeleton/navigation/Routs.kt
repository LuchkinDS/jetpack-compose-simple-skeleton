package ru.luchkinds.jetpack_compose_simple_skeleton.navigation

import kotlinx.serialization.Serializable

sealed class Routs {
    @Serializable
    data object First: Routs()
    @Serializable
    data object Second: Routs()
}