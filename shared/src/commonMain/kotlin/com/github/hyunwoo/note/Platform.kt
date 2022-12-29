package com.github.hyunwoo.note

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform