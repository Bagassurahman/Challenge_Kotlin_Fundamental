import java.util.*
import kotlin.math.ceil

fun balok_vol() {
    val input = Scanner(System.`in`)
    val panjang : Float
    val lebar : Float
    val tinggi : Float
    println("====Menghitung Volume Balok====")
    println("Masukkan Panjang = ")
    panjang = input.nextFloat()
    println("Masukkan Lebar = ")
    lebar = input.nextFloat()
    println("Masukkan Tinggi = ")
    tinggi = input.nextFloat()
    val vol_balok = panjang * lebar * tinggi
    val balok_bulat = ceil(vol_balok)
    println("Volume Balok = $vol_balok " +
            "\nVolume Balok Di bulatkan = $balok_bulat")
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

