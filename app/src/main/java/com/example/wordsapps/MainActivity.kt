package com.example.wordsapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.wordsapps.databinding.ActivityMainBinding
import android.view.LayoutInflater
//isian data kata kata berdasarkan array
data class data(
    val huruf: String,
    val kata: ArrayList<String>,
)
val katakata = arrayListOf(

    data("A", arrayListOf("Asam", "Arah", "Asin", "Alam", "Angin", "Asih", "Ajak", "Ayo", "Agama")),
    data("B", arrayListOf("Bahan", "Baku", "Bangunan", "Beli", "Basah", "Bijak", "Bisa", "Biasa")),
    data("C", arrayListOf("Cocok", "Cawan", "Cemara", "Cacing", "Camat", "Calon", "Cukur", "Culik")),
    data("E", arrayListOf("Enak", "Endap", "Ekstra", "Ejek", "Ekor", "Epoksi", "Enkapsulasi", "Eja", "Endorfin")),
    data("D", arrayListOf("Dalam", "Drama", "Dukuh", "Dungu", "Dusun", "Desa", "Darma", "Dimana", "Dia")),
    data("F", arrayListOf("Forum", "Film", "Fisik", "Fakir", "Fajar", "Filsafat", "Filsuf", "Fokus", "Fitrah")),
    data("G", arrayListOf("Gawai", "Gambar", "Garing", "Giras", "Ganteng", "Gagah", "Gagal", "Gila", "Gamblang")),
    data("H", arrayListOf("Hampa", "Hati", "Hayati", "Hanya", "Hilang", "Habis", "Hasut", "Hawa", "Hilal", "Hajar")),
    data("I", arrayListOf("Ilham", "Ini", "Ilmu", "Isyarat", "Indah", "Isi", "Informasi", "Islam", "Itikat", "Injil")),
    data("J", arrayListOf("Jalan", "Jauh", "Jika", "Jaman", "Jadi", "Jahat", "Jahil", "Jembatan", "Jaka", "Joko")),
    data("K", arrayListOf("Keliru", "Kupas", "Kasur", "Kasim", "Kurang", "Kasar", "Kaji", "Kutu", "Kuku", "Kuping")),
    data("L", arrayListOf("Lama", "Lambat", "Lusuh")),
    data("M", arrayListOf("Masuk", "Malam", "Makan")),
    data("N", arrayListOf("Nama", "Nasi", "Nasab")),
    data("O", arrayListOf("Olimpiade", "Okupansi", "Otak")),
    data("P", arrayListOf("Pasang", "Pola", "Pojok")),
    data("Q", arrayListOf("Quran", "Qari", "Qariah")),
    data("R", arrayListOf("Ramai", "Rawan", "Rias")),
    data("S", arrayListOf("Sawah", "Sampai", "Sambut")),
    data("T", arrayListOf("Tutur", "Tulis", "Tamu")),
    data("U", arrayListOf("Ukuran", "Uang", "Ulang")),
    data("V", arrayListOf("Vihara", "Vektor", "Vanadium")),
    data("X", arrayListOf("Xilem", "Xenon", "Xantofil")),
    data("Y", arrayListOf("Yayasan", "Yakin", "Yaman")),
    data("Z", arrayListOf("Zakat", "Zikir", "Ziarah")),
)


class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding as ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView,home())
                .commit() //transaksi data antar activity ke fragment dengan perintah replace (menampilkan frgament home)
        }

        setContentView(binding.root) }
    fun setWordFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)//backstack agar bisa back ke fragment sebelumnya
                .commit()//function akan digunakan pada adapter huruf dan melakukan tranfer data yakni kata kata yang sudah diinisialisasikan yang ada pda masing masing huruf
        } }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    } }