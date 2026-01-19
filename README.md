## Identitas Proyek
- **Judul Proyek** : Sistem Pencatatan Urugan Tanah
- **Mata Kuliah**  : Pemrograman Berorientasi Objek
- **Dosen Pengampu** : Tedy Setiadi, M.T
- **Tahun** : 2025

### Anggota Kelompok
1. Muhamad Faizin Al Bahri – 2400018057 
2. Muhammad Fauzan Anwar – 2400018012
3. Latifatul Istiana – 2400018037


**Link Repository**  
https://github.com/Artmzyyy/Sistem-Pencatatan-Urugan-PBO


Tampilan Awal Aplikasi
<img width="582" height="366" alt="image" src="https://github.com/user-attachments/assets/ab80c767-5193-45ff-9467-3246bfdcd867" />

b. Persoalan Bisnis dan Deskripsi Proyek

Pada proses pencatatan urugan tanah, sering ditemukan permasalahan seperti pencatatan manual yang tidak terstruktur, kesalahan perhitungan volume muatan, serta kesulitan dalam melihat rekap laporan transaksi. Hal ini dapat menyebabkan data transaksi tidak akurat dan sulit untuk ditelusuri kembali.

Berdasarkan permasalahan tersebut, dibuat sebuah aplikasi pencatatan transaksi urugan tanah berbasis Java dengan pendekatan Pemrograman Berorientasi Objek (PBO). Aplikasi ini bertujuan untuk membantu proses pencatatan transaksi secara terstruktur, menghitung volume muatan secara otomatis, serta menampilkan laporan transaksi dengan lebih rapi dan mudah dipahami.

c. Daftar Seluruh Spesifikasi Aplikasi

- Spesifikasi aplikasi yang dirancang antara lain:
- Input data transaksi urugan tanah
- Input nomor polisi kendaraan dan supplier
- Input dimensi muatan (panjang, lebar, tinggi)
- Perhitungan volume otomatis dalam satuan meter kubik (m³)
- Penyimpanan data transaksi menggunakan struktur data
- Menampilkan laporan transaksi
- Antarmuka aplikasi berbasis GUI menggunakan Java Swing

d. Rancangan Model Diagram UML

Perancangan sistem menggunakan diagram kelas (Class Diagram) yang menggambarkan hubungan antar class dalam aplikasi. Class utama yang digunakan antara lain Supplier, Truk, Dimensi, Transaksi, dan SistemUrugan. Relasi antar class dirancang sesuai dengan konsep Pemrograman Berorientasi Objek, di mana satu supplier dapat memiliki banyak truk, dan setiap transaksi berkaitan dengan satu truk dan satu dimensi muatan.

e. Rancangan Antar Muka Berbasis GUI

Antarmuka aplikasi dirancang menggunakan Java Swing dengan tampilan sederhana dan mudah digunakan. Aplikasi terdiri dari menu utama yang menyediakan pilihan input transaksi, menampilkan laporan, dan keluar dari aplikasi. Selain itu, terdapat form input transaksi untuk memasukkan data urugan serta form laporan untuk menampilkan hasil pencatatan transaksi.

f. Skrip Program dan Penjelasannya

Aplikasi dikembangkan menggunakan bahasa pemrograman Java dengan menerapkan konsep Pemrograman Berorientasi Objek. Setiap entitas pada sistem direpresentasikan dalam bentuk class. Class SistemUrugan berfungsi sebagai pengelola data transaksi, sedangkan class Transaksi menyimpan informasi transaksi urugan. Class Dimensi digunakan untuk menghitung volume muatan, dan class Truk serta Supplier digunakan untuk menyimpan data kendaraan dan penyedia urugan. Antarmuka GUI berfungsi sebagai penghubung antara pengguna dan sistem.

g. Penjelasan Screenshot Tampilan Aplikasi

Screenshot tampilan aplikasi menunjukkan menu utama, form input transaksi, serta halaman laporan transaksi. Menu utama digunakan untuk memilih fitur yang tersedia. Form input transaksi digunakan untuk memasukkan data urugan tanah, sedangkan tampilan laporan digunakan untuk menampilkan data transaksi yang telah disimpan oleh sistem.

h. Penjelasan Screenshot Status Unggah Skrip di Github

Screenshot Github menunjukkan bahwa seluruh skrip program telah berhasil diunggah ke repository Github. Proses pengunggahan dilakukan secara bertahap hingga mencapai versi final proyek. Hal ini menunjukkan bahwa pengembangan aplikasi dilakukan secara terstruktur dan terdokumentasi dengan baik.

i. Analisis Pengerjaan Proyek

Pengerjaan proyek dilakukan dalam waktu yang terbatas sesuai dengan ketentuan UAS take home. Dari sisi waktu, proyek dapat diselesaikan tepat waktu dengan pembagian tugas antar anggota kelompok. Dari sisi ketercapaian spesifikasi, sebagian besar fitur utama berhasil diimplementasikan sesuai perencanaan. Dari sisi biaya, proyek tidak memerlukan biaya tambahan karena menggunakan perangkat lunak gratis. Kendala utama yang dihadapi adalah perancangan struktur class dan penerapan konsep PBO secara tepat. Ke depan, aplikasi ini masih dapat dikembangkan dengan menambahkan fitur database, pencetakan laporan, serta peningkatan tampilan antarmuka.
