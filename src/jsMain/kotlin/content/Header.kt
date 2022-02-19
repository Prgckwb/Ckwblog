package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.dom.*

@Composable
fun Header() {
    A (
        attrs = {
            href("index.html")
        }
    ){
        Img(src = "./images/prgckwb.png")
    }

    Nav(){
        Ul {
            Li { Text("Works") }
            Li { Text("Article") }
        }
    }
}