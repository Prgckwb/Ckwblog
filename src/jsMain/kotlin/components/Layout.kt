package components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

@Composable
fun Layout(content: @Composable () -> Unit) {
    Div({
        style {
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Column)
            height(100.percent)
            margin(0.px)
            boxSizing("border-box")
        }
    }) {
        content()
    }
}