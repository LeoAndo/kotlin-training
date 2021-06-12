fun main() {
    println(ResourceManager.toString())

    ResourceManager.rgb = 0xAAAAAA
    ResourceManager.layoutId = 99
    ResourceManager.tag = "TAG2"

    println(ResourceManager.toString())
}
