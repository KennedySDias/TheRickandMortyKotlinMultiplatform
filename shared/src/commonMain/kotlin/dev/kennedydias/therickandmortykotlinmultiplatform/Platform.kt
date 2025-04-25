package dev.kennedydias.therickandmortykotlinmultiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform