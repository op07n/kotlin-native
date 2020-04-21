import kotlin.test.*
import mangling_keywords2.*
import kotlinx.cinterop.useContents

fun main() {
    // Check that all Kotlin keywords are imported and mangled.
    createKotlinKeywordsStruct().useContents {
        assertEquals(`as`, 0)
        assertEquals(`class`, 0)
        assertEquals(`dynamic`, 0)
        assertEquals(`false`, 0)
        assertEquals(`fun`, 0)
        assertEquals(`in`, 0)
        assertEquals(`interface`, 0)
        assertEquals(`is`, 0)
        assertEquals(`null`, 0)
        assertEquals(`object`, 0)
        assertEquals(`package`, 0)
        assertEquals(`super`, 0)
        assertEquals(`this`, 0)
        assertEquals(`throw`, 0)
        assertEquals(`true`, 0)
        assertEquals(`try`, 0)
        assertEquals(`typealias`, 0)
        assertEquals(`val`, 0)
        assertEquals(`var`, 0)
        assertEquals(`when`, 0)
    }

    assertEquals(KotlinKeywordsEnum.`as`, KotlinKeywordsEnum.`as`)
    assertEquals(KotlinKeywordsEnum.`class`, KotlinKeywordsEnum.`class`)
    assertEquals(KotlinKeywordsEnum.`dynamic`, KotlinKeywordsEnum.`dynamic`)
    assertEquals(KotlinKeywordsEnum.`false`, KotlinKeywordsEnum.`false`)
    assertEquals(KotlinKeywordsEnum.`fun`, KotlinKeywordsEnum.`fun`)
    assertEquals(KotlinKeywordsEnum.`in`, KotlinKeywordsEnum.`in`)
    assertEquals(KotlinKeywordsEnum.`interface`, KotlinKeywordsEnum.`interface`)
    assertEquals(KotlinKeywordsEnum.`is`, KotlinKeywordsEnum.`is`)
    assertEquals(KotlinKeywordsEnum.`null`, KotlinKeywordsEnum.`null`)
    assertEquals(KotlinKeywordsEnum.`object`, KotlinKeywordsEnum.`object`)
    assertEquals(KotlinKeywordsEnum.`package`, KotlinKeywordsEnum.`package`)
    assertEquals(KotlinKeywordsEnum.`super`, KotlinKeywordsEnum.`super`)
    assertEquals(KotlinKeywordsEnum.`this`, KotlinKeywordsEnum.`this`)
    assertEquals(KotlinKeywordsEnum.`throw`, KotlinKeywordsEnum.`throw`)
    assertEquals(KotlinKeywordsEnum.`true`, KotlinKeywordsEnum.`true`)
    assertEquals(KotlinKeywordsEnum.`try`, KotlinKeywordsEnum.`try`)
    assertEquals(KotlinKeywordsEnum.`typealias`, KotlinKeywordsEnum.`typealias`)
    assertEquals(KotlinKeywordsEnum.`val`, KotlinKeywordsEnum.`val`)
    assertEquals(KotlinKeywordsEnum.`var`, KotlinKeywordsEnum.`var`)
    assertEquals(KotlinKeywordsEnum.`when`, KotlinKeywordsEnum.`when`)
}