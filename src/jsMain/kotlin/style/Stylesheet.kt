package style

import org.jetbrains.compose.web.css.*

object AppStyleSheet : StyleSheet() {
    init {
        "html" style {
            fontSize(100.percent)
        }
        "body" style {
            fontFamily("Yu Gothic Medium", "游ゴシック Medium", "YuGothic", "游ゴシック体", "ヒラギノ角ゴ Pro W3", "sans-serif")
            lineHeight("1.7")
            color(Color("#432"))
        }
        "a" style {
            textDecoration("none")
        }
        "img" style {
            maxWidth(100.percent)
        }
        "iframe" style {
            width(100.percent)
        }
        "article" style {
            width(74.0.percent)
            "img" style {
                marginBottom(20.px)
            }
            "p" style {
                marginBottom(1.0.cssRem)
            }
        }
        "aside" style {
            width(22.0.percent)
            "p" style {
                padding(12.px, 10.px)
            }
        }
    }

    val wrapper by style {
        maxWidth(1100.px)
        property("margin", "0 auto")
        padding(0.px, 4.percent)
    }

    val big_bg by style {
        backgroundSize("cover")
        backgroundPosition("center top")
//        property("background-size", "cover")
//        property("background-position", "center top")
    }
    val page_title by style {
        fontSize(5.0.cssRem)
        fontFamily("Philosopher", "serif")
        property("text-transform", "uppercase")
        fontWeight("normal")

        textAlign("center")
    }
    val sub_title by style {
        fontSize(1.375.cssRem)
        padding(0.px, 8.px, 8.px)
        property("border-bottom", "2px #93CC97 solid")
        fontWeight("normal")
    }

    val button by style {
        fontSize(1.375.cssRem)
        background("#0bd")
        color(Color("#fff"))
        borderRadius(5.px)
        padding(18.px, 32.px)
        hover(self) style {
            background("#0090aa")
        }
    }

    //    HEADER
    val page_header by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.SpaceBetween)

//        my css
        backgroundColor(Color("#93CC97"))
    }

    val logo by style {
        width(210.px)
        marginTop(14.px)
    }

    val main_nav by style {
        display(DisplayStyle.Flex)
        fontSize(1.25.cssRem)
        property("text-transform", "uppercase")
        marginTop(34.px)
        listStyle("none")
        "li" style {
            marginLeft(36.px)
        }
        "a" style {
            color(Color("#432"))
            hover(self) style {
                color(Color("#0bd"))
            }
        }
    }

    //    HOME (L100)
    val home by style { }
    val home_content by style { }

    //    NEWS (L121)
    val news by style {
        backgroundImage("url(./images/prgckwb.jpg)")
        height(270.px)
        marginBottom(40.px)
//        page_title.style {
//            textAlign("center")
//        }
    }
    val news_contents by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.SpaceBetween)
        marginBottom(50.px)
    }

    //    Article
    val post_info by style {
        position(Position.Relative)
        paddingTop(4.px)
        marginBottom(40.px)
    }
    val post_date by style {
        background("#93CC97")
        borderRadius(50.0.percent)
        color(Color("#fff"))
        width(100.px)
        height(100.px)
        fontSize(1.625.cssRem)
        textAlign("center")
        position(Position.Absolute)
        top(0.px)
        paddingTop(10.px)
        "span" style {
            fontSize(1.0.cssRem)
            property("border-top", "1px rgba(255, 255, 255, .5) solid")
            paddingTop(6.px)
            display(DisplayStyle.Block)
            width(60.percent)
            property("margin", "0 auto")
        }
    }
    val post_title by style {
        fontFamily("Yu Mincho", "YuMincho", "serif")
        fontSize(2.0.cssRem)
        fontWeight("normal")
        marginLeft(120.px)
    }

    val post_cat by style {
        marginLeft(120.px)
    }

    //    sidebar
    val sub_menu by style {
        marginBottom(60.px)
        listStyle("none")
        "li" style {
            property("border-bottom", "1px #ddd solid")
        }
        "a" style {
            color(Color("#432"))
            padding(10.px)
            display(DisplayStyle.Block)
            hover(self) style {
                color(Color("#0bd"))
            }
        }
    }
}