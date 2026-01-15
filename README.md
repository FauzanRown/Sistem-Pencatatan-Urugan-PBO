# Sistem Pencatatan Urugan Tanah Berbasis Java (PBO)

## Identitas Proyek
- **Judul Proyek** : Sistem Pencatatan Urugan Tanah
- **Mata Kuliah**  : Pemrograman Berorientasi Objek
- **Dosen Pengampu** : Tedy Setiadi, M.T
- **Tahun** : 2025

### Anggota Kelompok
1. Muhamad Faizin Al Bahri – 2400018057 
2. Muhammad Fauzan Anwar – 2400018012
3. Latifatul Istiana – 2400018037

🔗 **Link Repository**  
https://github.com/Artmzyyy/Sistem-Pencatatan-Urugan-PBO

---

## Deskripsi Proyek
Aplikasi ini dibuat untuk membantu proses pencatatan transaksi urugan tanah secara sederhana dan terstruktur.  
Sistem memungkinkan pengguna untuk mencatat data transaksi berupa nomor polisi kendaraan, supplier, dimensi muatan (panjang, lebar, tinggi), serta menghasilkan informasi volume urugan tanah dalam satuan meter kubik (m³).

Aplikasi dikembangkan menggunakan bahasa pemrograman Java dengan antarmuka berbasis GUI (Swing) serta menerapkan konsep Pemrograman Berorientasi Objek (PBO).

---

## Permasalahan
Pada proses pencatatan urugan tanah secara manual, sering terjadi:
- Kesalahan perhitungan volume
- Data transaksi tidak terdokumentasi dengan baik
- Sulitnya melihat laporan transaksi secara keseluruhan

Oleh karena itu, dibutuhkan sebuah aplikasi berbasis PBO untuk mengelola data transaksi urugan tanah secara sistematis.

---

## Spesifikasi Aplikasi
- Input data transaksi urugan tanah
- Perhitungan otomatis volume (m³)
- Penyimpanan data transaksi dalam struktur data
- Tampilan laporan transaksi
- Antarmuka berbasis GUI (Java Swing)

---

## Konsep PBO yang Digunakan
- Class dan Object
- Encapsulation
- Association antar class
- Struktur data `ArrayList`
- Pemisahan logika sistem dan antarmuka GUI

---

## Daftar Class
- `Supplier`
- `Truk`
- `Dimensi`
- `Transaksi`
- `SistemUrugan`
- `MainGUI`
- `FormInputTransaksi`
- `FormLaporan`

---

## Tampilan Aplikasi
Aplikasi terdiri dari:
1. Menu Utama
2. Form Input Transaksi
3. Form Laporan Transaksi


<img width="582" height="366" alt="image" src="https://github.com/user-attachments/assets/ab80c767-5193-45ff-9467-3246bfdcd867" />

**Tampilan Menu Utama**

<img width="582" height="516" alt="image" src="https://github.com/user-attachments/assets/e877063d-f10c-4025-8d26-dcf91bb8d9fe" />

**Tampilan Input**

<img width="732" height="591" alt="image" src="https://github.com/user-attachments/assets/450a6815-5eb0-4624-86d3-4fd26da7bfb6" />

**Tampilan Laporan Transaksi Jika Belum Ada Data**

<img width="579" height="511" alt="image" src="https://github.com/user-attachments/assets/71e877f8-661f-4694-a51f-119faf694d1a" />

**Tampilan Jika Supplier Belum Ada di Database**

<img width="580" height="511" alt="image" src="https://github.com/user-attachments/assets/4b8ed1c3-bb1e-49af-84c5-661cc62bba8f" />

**Tampilan Jika Supplier Sudah Ada di Database** 

<img width="576" height="510" alt="image" src="https://github.com/user-attachments/assets/7dae6ea4-d4b9-4cc3-9cea-401976d86381" />

**Tampilan Transaksi Berhasil di Simpan**

<img width="732" height="591" alt="image" src="https://github.com/user-attachments/assets/871fc676-04b8-4ef9-bd1d-eab60e6c4725" />

**Tampilan Laporan Transaksi**

---

## Cara Menjalankan Program
1. Buka project menggunakan IDE Java (IntelliJ IDEA / NetBeans)
2. Jalankan file `MainGUI.java`
3. Pilih menu sesuai kebutuhan

---

## Analisis Pengerjaan Proyek
- **Waktu pengerjaan** : 3 minggu
- **Kendala** : Perancangan class dan relasi antar objek
- **Solusi** : Analisis ulang kebutuhan sistem dan penerapan PBO secara bertahap
- **Pengembangan ke depan** :
  - Penyimpanan database
  - Export laporan ke PDF
  - Validasi input yang lebih lengkap
  - Fitur pencarian data
  - Fitur filter berdasarkan tanggal transaksi, dan supplier

---

## Lisensi
Proyek ini dibuat untuk keperluan akademik.
