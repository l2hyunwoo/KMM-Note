package com.github.hyunwoo.note.domain.note

import com.github.hyunwoo.note.presentation.BabyBlue
import com.github.hyunwoo.note.presentation.LightGreen
import com.github.hyunwoo.note.presentation.RedOrange
import com.github.hyunwoo.note.presentation.RedPink
import com.github.hyunwoo.note.presentation.Violet
import kotlinx.datetime.LocalDateTime

data class Note(
    val id: Long?,
    val title: String,
    val content: String,
    val colorHex: Long,
    val created: LocalDateTime,
) {
    companion object {
        private val colors = listOf(
            RedOrange,
            RedPink,
            BabyBlue,
            Violet,
            LightGreen,
        )

        fun generateRandomColor() = colors.random()
    }
}
