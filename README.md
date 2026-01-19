<img width="926" height="1006" alt="image" src="https://github.com/user-attachments/assets/4f8dfb23-2b96-4230-bb8e-4d2afb4b2d97" />## A. Identitas Proyek
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

<img width="582" height="366" alt="image" src="https://github.com/user-attachments/assets/ab80c767-5193-45ff-9467-3246bfdcd867" />

Tampilan Awal Aplikasi

## B. Persoalan Bisnis dan Deskripsi Proyek

Pada proses pencatatan urugan tanah, sering ditemukan permasalahan seperti pencatatan manual yang tidak terstruktur, kesalahan perhitungan volume muatan, serta kesulitan dalam melihat rekap laporan transaksi. Hal ini dapat menyebabkan data transaksi tidak akurat dan sulit untuk ditelusuri kembali.

Berdasarkan permasalahan tersebut, dibuat sebuah aplikasi pencatatan transaksi urugan tanah berbasis Java dengan pendekatan Pemrograman Berorientasi Objek (PBO). Aplikasi ini bertujuan untuk membantu proses pencatatan transaksi secara terstruktur, menghitung volume muatan secara otomatis, serta menampilkan laporan transaksi dengan lebih rapi dan mudah dipahami.

## C. Daftar Seluruh Spesifikasi Aplikasi

- Spesifikasi aplikasi yang dirancang antara lain:
- Input data transaksi urugan tanah
- Input nomor polisi kendaraan dan supplier
- Input dimensi muatan (panjang, lebar, tinggi)
- Perhitungan volume otomatis dalam satuan meter kubik (m³)
- Penyimpanan data transaksi menggunakan struktur data
- Menampilkan laporan transaksi
- Antarmuka aplikasi berbasis GUI menggunakan Java Swing

## D. Rancangan Model Diagram UML

<img width="541" height="704" alt="Class Diagram" src="https://github.com/user-attachments/assets/247ce9a5-d656-4b64-9bbe-c93d8b30648c" />

Perancangan sistem menggunakan diagram kelas (Class Diagram) yang menggambarkan hubungan antar class dalam aplikasi. Class utama yang digunakan antara lain Supplier, Truk, Dimensi, Transaksi, dan SistemUrugan. Relasi antar class dirancang sesuai dengan konsep Pemrograman Berorientasi Objek, di mana satu supplier dapat memiliki banyak truk, dan setiap transaksi berkaitan dengan satu truk dan satu dimensi muatan.

## E. Rancangan Antar Muka Berbasis GUI

Antarmuka aplikasi dirancang menggunakan Java Swing dengan tampilan sederhana dan mudah digunakan. Aplikasi terdiri dari menu utama yang menyediakan pilihan input transaksi, menampilkan laporan, dan keluar dari aplikasi. Selain itu, terdapat form input transaksi untuk memasukkan data urugan serta form laporan untuk menampilkan hasil pencatatan transaksi.

## F. Skrip Program dan Penjelasannya

Aplikasi dikembangkan menggunakan bahasa pemrograman Java dengan menerapkan konsep Pemrograman Berorientasi Objek.
Berikut penjelasan setiap class nya.

<img width="1330" height="954" alt="image" src="https://github.com/user-attachments/assets/c32864b0-1db0-4352-b0d8-b8d8207ac81f" />

**Class Dimensi**

Class Dimensi digunakan untuk menyimpan data ukuran muatan urugan tanah, yaitu panjang, lebar, dan tinggi. Class ini juga memiliki metode untuk menghitung volume muatan berdasarkan rumus panjang × lebar × tinggi.

Dengan memisahkan perhitungan volume ke dalam class Dimensi, sistem menjadi lebih terstruktur dan sesuai dengan prinsip Pemrograman Berorientasi Objek, di mana setiap class memiliki tanggung jawab yang jelas.

---

<img width="883" height="806" alt="image" src="https://github.com/user-attachments/assets/6458b671-88ae-4d5f-8173-3499ad293744" />

**Class Truk**

Class Truk digunakan untuk merepresentasikan kendaraan yang digunakan dalam proses pengangkutan urugan tanah. Setiap truk memiliki nomor polisi sebagai identitas unik serta terhubung dengan satu supplier tertentu. Selain itu, class ini juga memiliki data dimensi muatan yang digunakan untuk menghitung volume urugan.

Class Truk berperan sebagai objek perantara antara supplier dan transaksi, karena setiap transaksi selalu melibatkan satu truk tertentu.

---

<img width="874" height="366" alt="image" src="https://github.com/user-attachments/assets/c71a638c-ff2f-4ecf-bf20-806de8bd3439" />

**Class Supplier** 

Class Supplier digunakan untuk merepresentasikan pihak penyedia urugan tanah. Supplier berperan sebagai pemilik atau pengelola beberapa kendaraan truk yang digunakan untuk mengangkut urugan tanah. Class ini menyimpan informasi dasar supplier, seperti nama supplier, dan menjadi penghubung antara truk dan transaksi yang terjadi.

Dalam sistem, satu objek Supplier dapat berasosiasi dengan lebih dari satu objek Truk, sehingga mencerminkan kondisi nyata di mana satu supplier dapat memiliki banyak kendaraan.

---

<img width="886" height="795" alt="image" src="https://github.com/user-attachments/assets/63945381-f1e1-4cad-852d-64b4faae4cbb" />

**Class Transaksi**

Class Transaksi digunakan untuk menyimpan data setiap proses pengiriman atau pencatatan urugan tanah. Transaksi mencakup informasi truk yang digunakan, volume urugan, serta data tambahan seperti tanggal transaksi. Class ini berfungsi sebagai representasi dari satu kejadian transaksi yang terjadi dalam sistem.

Setiap objek Transaksi memiliki hubungan dengan satu objek Truk dan secara tidak langsung terhubung dengan supplier melalui truk tersebut.

---

<img width="922" height="885" alt="image" src="https://github.com/user-attachments/assets/72ba1689-f1b8-4b9a-8a85-900bf8bc4f91" />

**Class SistemUrugan**

Class SistemUrugan berfungsi sebagai pusat pengelolaan data dalam aplikasi. Class ini bertanggung jawab untuk menyimpan, mengelola, dan menampilkan data transaksi urugan tanah. Di dalam class ini digunakan struktur data untuk menampung kumpulan objek Transaksi.

Class SistemUrugan juga menyediakan metode untuk menambah transaksi baru serta mengambil data transaksi yang akan ditampilkan dalam laporan. Dengan adanya class ini, logika sistem terpisah dari antarmuka pengguna.

Antarmuka GUI berfungsi sebagai penghubung antara pengguna dan sistem

---

<img width="980" height="991" alt="image" src="https://github.com/user-attachments/assets/aeef0767-d1a3-413f-83d6-76cd977fd11d" />

**Class MainGUI**

Class MainGUI merupakan tampilan utama aplikasi berbasis GUI. Class ini menampilkan menu awal yang berisi pilihan untuk melakukan input transaksi, menampilkan laporan, atau keluar dari aplikasi. Class ini berfungsi sebagai penghubung awal antara pengguna dan sistem.

MainGUI tidak menyimpan logika bisnis, melainkan hanya mengatur navigasi antar form dan memanggil class lain sesuai dengan pilihan pengguna.

---

<img width="926" height="1006" alt="image" src="https://github.com/user-attachments/assets/0d7e789e-53a1-426a-b335-1d010c2ce4ce" />
<img width="964" height="885" alt="image" src="https://github.com/user-attachments/assets/2b9f1298-0956-4cb0-b0b5-9c973c5b05d0" />
<img width="1338" height="997" alt="image" src="https://github.com/user-attachments/assets/91cf1184-31c6-4d99-8def-ef21f1002f82" />

**Class FormInputTransaksi**

Class FormInputTransaksi digunakan sebagai antarmuka untuk memasukkan data transaksi urugan tanah. Pada form ini, pengguna dapat memasukkan nomor polisi kendaraan, nama supplier, serta dimensi muatan. Data yang dimasukkan kemudian diteruskan ke class SistemUrugan untuk diproses dan disimpan.

Class ini berfokus pada pengambilan input dari pengguna dan tidak melakukan proses perhitungan secara langsung, sehingga menjaga pemisahan antara antarmuka dan logika sistem.

---

<img width="988" height="682" alt="image" src="https://github.com/user-attachments/assets/0b093bb4-b9ab-4196-9d17-e181bd97e77d" />

**Class FormLaporan**

Class FormLaporan digunakan untuk menampilkan laporan transaksi urugan tanah yang telah tersimpan dalam sistem. Data laporan diambil dari class SistemUrugan dan ditampilkan dalam bentuk teks melalui antarmuka GUI.

Class ini berfungsi sebagai media penyajian informasi kepada pengguna tanpa mengubah atau memproses ulang data transaksi.

## G. Penjelasan Screenshot Tampilan Aplikasi

<img width="582" height="366" alt="image" src="https://github.com/user-attachments/assets/ab80c767-5193-45ff-9467-3246bfdcd867" />

**Tampilan Menu Utama**

Disini user bisa memilih ingin memasukkan transaksi atau melihat laporan transaksi.

---

<img width="582" height="516" alt="image" src="https://github.com/user-attachments/assets/e877063d-f10c-4025-8d26-dcf91bb8d9fe" />

**Tampilan Input**

Pada tampilan input terdapat beberapa inputan seperti No Polisi, Nama Supplier, Dimensi dari bak truk, dan ritase dari truk itu sendiri.

---

<img width="732" height="591" alt="image" src="https://github.com/user-attachments/assets/450a6815-5eb0-4624-86d3-4fd26da7bfb6" />

**Tampilan Laporan Transaksi Jika Belum Ada Data**

Jika belum ada transaksi yang diinputkan, maka akan menampilkan tulisan "Belum ada transaksi!" seperti diatas

---

<img width="579" height="511" alt="image" src="https://github.com/user-attachments/assets/71e877f8-661f-4694-a51f-119faf694d1a" />

**Tampilan Jika Supplier Belum Ada di Database**

Setelah user memasukkan inputan yang tersedia diatas, dan terjadi pengecekkan pada database (disini masih menggunakan struktur data bawaan program) jika nama supplier sudah belum tersedia di database, maka akan muncul notifikasi diatas, dan dibuatlah database baru dengan nama yang sudah dimasukkan.

---

<img width="580" height="511" alt="image" src="https://github.com/user-attachments/assets/4b8ed1c3-bb1e-49af-84c5-661cc62bba8f" />

**Tampilan Jika Supplier Sudah Ada di Database**
Jika nama supplier sudah ada di database, maka tidak ada pop up input data baru seperti yang sebelumnya, karena sudah ada di database.

---

<img width="576" height="510" alt="image" src="https://github.com/user-attachments/assets/7dae6ea4-d4b9-4cc3-9cea-401976d86381" />

**Tampilan Transaksi Berhasil di Simpan**
Pop up tampilan transaksi berhasil disimpan, dan data akan secara otomatis masuk ke Laporan Transaksi

---

<img width="732" height="591" alt="image" src="https://github.com/user-attachments/assets/871fc676-04b8-4ef9-bd1d-eab60e6c4725" />

**Tampilan Laporan Transaksi**
Tampilan laporan transaksi sederhana, dan disini untuk tanggalnya di generate secara otomatis sesuai dengan tanggal sekarang, agar user tidak kesusahan dalam menginputkan transaksi. 

---

## H. Penjelasan Screenshot Status Unggah Skrip di Github

Screenshot Github menunjukkan bahwa seluruh skrip program telah berhasil diunggah ke repository Github. Proses pengunggahan dilakukan secara bertahap hingga mencapai versi final proyek. Hal ini menunjukkan bahwa pengembangan aplikasi dilakukan secara terstruktur dan terdokumentasi dengan baik.

## I. Analisis Pengerjaan Proyek

Pengerjaan proyek dilakukan dalam waktu 3 minggu. Dari sisi waktu, proyek dapat diselesaikan tepat waktu dengan pembagian tugas antar anggota kelompok. Dari sisi ketercapaian spesifikasi, sebagian besar fitur utama berhasil diimplementasikan sesuai perencanaan. Dari sisi biaya, proyek tidak memerlukan biaya tambahan karena menggunakan perangkat lunak gratis. Kendala utama yang dihadapi adalah perancangan struktur class dan penerapan konsep PBO secara tepat. Ke depan, aplikasi ini masih dapat dikembangkan dengan menambahkan fitur database, pencetakan laporan, serta peningkatan tampilan antarmuka.
