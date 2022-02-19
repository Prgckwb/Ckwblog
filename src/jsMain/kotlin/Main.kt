import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import components.Layout
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

import content.*

fun main() {
    renderComposable(rootElementId = "root") {
        Layout {
            Header()
        }
    }
}

