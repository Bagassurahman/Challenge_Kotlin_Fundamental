import java.util.*

fun main() {

    // scanner
    val input2 = Scanner(System.`in`)

    // identitas
    val input = Scanner(System.`in`)
    println("==============================")

    // nama
    println("Masukkan Nama : ")
    val nama: String? = input.nextLine()
    if (nama.isNullOrEmpty()){
        println("Nama is required")
        main()
    }

    // absen
    println("Masukkan No.Absen : ")
    val absen: String? = input.nextLine()
    if (absen.isNullOrEmpty()){
        println("Absen is required")
        main()
    }

    // Kelas
    println("Masukkan Kelas : ")
    val kelas: String? = input.nextLine()
    if (kelas.isNullOrEmpty()){
        println("Kelas is required")
        main()
    }
    println("==============================")

    // Menu

    println("==============================")
    println("1. Volume Balok ")
    println("2. Volume Bola ")
    println("Masukkan Pilihan Menu [1/2] = ")
    val menu = readLine()
    println("==============================")

    when (menu){
        "1" -> {
            balok_vol()
        }
        "2" -> {
            bola_vol()
        }
    }

}


