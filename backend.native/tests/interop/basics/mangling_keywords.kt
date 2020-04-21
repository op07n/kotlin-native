import kotlin.test.*
import mangling_keywords.*

fun main() {
    // Check that all Kotlin keywords are imported and mangled.
    assertEquals(`as`, "as")
    assertEquals(`break`, "break")
    assertEquals(`class`, "class")
    assertEquals(`continue`, "continue")
    assertEquals(`do`, "do")
    assertEquals(`dynamic`, "dynamic")
    assertEquals(`else`, "else")
    assertEquals(`false`, "false")
    assertEquals(`for`, "for")
    assertEquals(`fun`, "fun")
    assertEquals(`if`, "if")
    assertEquals(`in`, "in")
    assertEquals(`interface`, "interface")
    assertEquals(`is`, "is")
    assertEquals(`null`, "null")
    assertEquals(`object`, "object")
    assertEquals(`package`, "package")
    assertEquals(`return`, "return")
    assertEquals(`super`, "super")
    assertEquals(`this`, "this")
    assertEquals(`throw`, "throw")
    assertEquals(`true`, "true")
    assertEquals(`try`, "try")
    assertEquals(`typealias`, "typealias")
    assertEquals(`val`, "val")
    assertEquals(`var`, "var")
    assertEquals(`when`, "when")
    assertEquals(`while`, "while")
}

