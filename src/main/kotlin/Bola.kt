import java.util.*
import kotlin.math.PI
import kotlin.math.ceil


fun bola_vol(){
    val input = Scanner(System.`in`)
    val jari : Float
    println("====Menghitung Volume Bola====")
    println("Masukkan Jari Jari = ")
    jari = input.nextFloat()

    val volume_balok = 4/3 * PI * jari * jari
    val bola_bulat = ceil(volume_balok)

    val vol = """
        Volume Bola = $volume_balok
        Volume Bola Di bulatkan = $bola_bulat
    """.trimIndent()
    println("$vol")
    // kembali
    println("Ingin Kembali Ke Menu ? [Y/N] = ")
    val back = readLine()
    if (back == "Y"){
        main()
    }
    else{
        println("Thanks")
    }
    println("===============================")
}