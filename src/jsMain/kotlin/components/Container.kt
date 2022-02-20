package components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.HTMLDivElement
import style.AppStyleSheet

@Composable
fun Layout(content: @Composable () -> Unit) {
    Div({
        style {
//
        }
    }) {
        content()
    }
}