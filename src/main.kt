import java.io.File

fun main(args: Array<String>) {
    // ファイルを読み込む
    fun readFileDirectlyAsText(filepath: String): String
            = File(filepath).readText(Charsets.UTF_8)
    val filepath = "./sample/script.st"
    println(readFileDirectlyAsText(filepath))
}
