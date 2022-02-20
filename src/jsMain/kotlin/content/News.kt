package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.dom.*
import style.AppStyleSheet


@Composable
fun News() {
    Div(attrs = {
        classes(AppStyleSheet.news, AppStyleSheet.big_bg)
    }) {
        Header(attrs = { classes(AppStyleSheet.page_header, AppStyleSheet.wrapper) }) {
            H1 {
                A(href = "index.html") {
                    Img(attrs = { classes(AppStyleSheet.logo) }, src = "./images/logo.svg", alt = "")
                }
            }
            Nav {
                Ul(attrs = { classes(AppStyleSheet.main_nav) }) {
                    Li { A(href = "index.html") { Text("Article") } }
                    Li { A(href = "index.html") { Text("Works") } }
                }
            }
        }

        Div(attrs = { classes(AppStyleSheet.wrapper) }) {
            H2(attrs = { classes(AppStyleSheet.page_title) }) { Text("News") }
        }
    }

    Div(attrs = { classes(AppStyleSheet.news_contents, AppStyleSheet.wrapper) }) {
        Article {
            Header(attrs = { classes(AppStyleSheet.post_info) }) {
                H2(attrs = { classes(AppStyleSheet.post_title) }) { Text("店内ギャラリーの絵が新しくなりました") }
                P(attrs = { classes(AppStyleSheet.post_date) }) {
                    Text("3/30")
                    Span { Text("2019") }
                }
                P(attrs = { classes(AppStyleSheet.post_cat) }) { Text("カテゴリー：お店の紹介") }
            }
            Img(src = "images/wall.jpg", alt = "店内の様子")
            P {
                Text(
                    """
                体に優しい自然食を提供する、WCB CAFE。無添加の食材を利用したメニューが特徴です。
                おいしいブレンドコーヒーとヘルシーなオーガニックフードで体の内側から癒やされてください。
                体に優しい自然食を提供する、WCB CAFE。無添加の食材を利用したメニューが特徴です。
                おいしいブレンドコーヒーとヘルシーなオーガニックフードで体の内側から癒やされてください。
                """.trimIndent()
                )
            }
            P {
                Text(
                    """
                体に優しい自然食を提供する、WCB CAFE。無添加の食材を利用したメニューが特徴です。
                おいしいブレンドコーヒーとヘルシーなオーガニックフードで体の内側から癒やされてください。
                体に優しい自然食を提供する、WCB CAFE。無添加の食材を利用したメニューが特徴です。
                おいしいブレンドコーヒーとヘルシーなオーガニックフードで体の内側から癒やされてください。
                体に優しい自然食を提供する、WCB CAFE。無添加の食材を利用したメニューが特徴です。
                おいしいブレンドコーヒーとヘルシーなオーガニックフードで体の内側から癒やされてください。
                """.trimIndent()
                )
            }
            P { Text("体に優しい自然食を提供する、WCB CAFE。") }
        }
        Aside {
            H3(attrs = { classes(AppStyleSheet.sub_title) }) { Text("カテゴリー") }
            Ul(attrs = { classes(AppStyleSheet.sub_menu) }) {
                Li { A(href = "#") { Text("お店の紹介") } }
                Li { A(href = "#") { Text("期間限定メニュー") } }
                Li { A(href = "#") { Text("イベント") } }
                Li { A(href = "#") { Text("お客様との会話") } }
            }
            H3(attrs = { classes(AppStyleSheet.sub_title) }) { Text("このお店について") }
            P {
                Text(
                    """
                  体に優しい自然食を提供する、WCB CAFE。無添加の食材を利用したメニューが特徴です。
                  おいしいブレンドコーヒーとヘルシーなオーガニックフードで体の内側から癒やされてください。
                   """.trimIndent()
                )
            }
        }
    }
}