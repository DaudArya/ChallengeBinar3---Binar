package com.example.wordsapps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController

data class data (
    val alphabet: Char,
    val list: ArrayList<String>
)

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    val katakata = arrayListOf(

        data('A', arrayListOf("Asam", "Arah", "Asin", "Alam", "Angin", "Asih", "Ajak", "Ayo", "Agama")),
        data('B', arrayListOf("Bahan", "Baku", "Bangunan", "Beli", "Basah", "Bijak", "Bisa", "Biasa")),
        data('C', arrayListOf("Cocok", "Cawan", "Cemara", "Cacing", "Camat", "Calon", "Cukur", "Culik")),
        data('E', arrayListOf("Enak", "Endap", "Ekstra", "Ejek", "Ekor", "Epoksi", "Enkapsulasi", "Eja", "Endorfin")),
        data('D', arrayListOf("Dalam", "Drama", "Dukuh", "Dungu", "Dusun", "Desa", "Darma", "Dimana", "Dia")),
        data('F', arrayListOf("Forum", "Film", "Fisik", "Fakir", "Fajar", "Filsafat", "Filsuf", "Fokus", "Fitrah")),
        data('G', arrayListOf("Gawai", "Gambar", "Garing", "Giras", "Ganteng", "Gagah", "Gagal", "Gila", "Gamblang")),
        data('H', arrayListOf("Hampa", "Hati", "Hayati", "Hanya", "Hilang", "Habis", "Hasut", "Hawa", "Hilal", "Hajar")),
        data('I', arrayListOf("Ilham", "Ini", "Ilmu", "Isyarat", "Indah", "Isi", "Informasi", "Islam", "Itikat", "Injil")),
        data('J', arrayListOf("Jalan", "Jauh", "Jika", "Jaman", "Jadi", "Jahat", "Jahil", "Jembatan", "Jaka", "Joko")),
        data('K', arrayListOf("Keliru", "Kupas", "Kasur", "Kasim", "Kurang", "Kasar", "Kaji", "Kutu", "Kuku", "Kuping")),
        data('L', arrayListOf("Lama", "Lambat", "Lusuh")),
        data('M', arrayListOf("Masuk", "Malam", "Makan")),
        data('N', arrayListOf("Nama", "Nasi", "Nasab")),
        data('O', arrayListOf("Olimpiade", "Okupansi", "Otak")),
        data('P', arrayListOf("Pasang", "Pola", "Pojok")),
        data('Q', arrayListOf("Quran", "Qari", "Qariah")),
        data('R', arrayListOf("Ramai", "Rawan", "Rias")),
        data('S', arrayListOf("Sawah", "Sampai", "Sambut")),
        data('T', arrayListOf("Tutur", "Tulis", "Tamu")),
        data('U', arrayListOf("Ukuran", "Uang", "Ulang")),
        data('V', arrayListOf("Vihara", "Vektor", "Vanadium")),
        data('X', arrayListOf("Xilem", "Xenon", "Xantofil")),
        data('Y', arrayListOf("Yayasan", "Yakin", "Yaman")),
        data('Z', arrayListOf("Zakat", "Zikir", "Ziarah")),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.Fragment1) as NavHostFragment

        navController = navHostFragment.navController
        setupActionBarWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }


}