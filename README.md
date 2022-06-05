# Event Tix
Blablabla

## Pembagian Tugas
#### Naufal Fawwaz Andriawan
- [x] Transaction Page - User

#### Nassya Putri Riyani
- [ ] Event List (Home Page) - User
- [ ] Detail Event - User
- [ ] Add Transaction - User

#### Aryaputra
- [ ] Event List - Admin

#### Dhafin Taufiqi
- [ ] Add event - Admin

#### Ikhsan 
- [ ] Sign in
- [ ] Sign up

#### Ijah
- [ ] Transaction List Page - Admin

#### Faaris
- [ ] Transaction change status - Admin (Coordination with ijah)
- [ ] Logout

## Alur Aplikasi
#### Autentikasi
- Dimulai di halaman sign in
- Check admin atau bukan pakai role di user
If Admin
- Masuk ke home admin
If user
- Masuk halaman home user

#### Membeli Tiket - User
- Masuk halaman home
- Pilih event
- Masuk halaman detail
- Klik daftar
- Add transaksi
- Balik halaman home

#### Cek transaksi - User
- Masuk halaman home
- Pilih menu transaksi
- Klik tabel transaksi

#### Tambah Event - Admin
- Masuk ke home admin
- Klik tambah
- Masuk halaman form tambah event
- Isi form
- Klik submit
- Insert data
- Balik halaman event

#### Ubah status pembayaran menjadi sukses - Admin
- Masuk home admin
- Masuk halaman transaksi
- Klik salah satu data
- Muncul popup
- Klik ubah
- Update data
- Tutup dialog

## Cara mengerjakan
- Clone repository ini dengan ```git clone https://github.com/andriawan24/event-tix```
- Buat branch baru dengan perintah ```git checkout -b [nama]```
- Tambahkan fitur, transaksi database di package ```repository```, tampilan di package ```pages```
- Jika sudah, pastikan fitur sudah berjalan lancar
- Kumpulkan pekerjaan menggunakan ```git pull origin master```
- Jalankan kembali aplikasi, pastikan tidak ada yang rusak
- Buat Pull Request di github menu pull request, caranya ada di [sini](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-a-pull-request)
- Laporan di grup

## License
[MIT](https://choosealicense.com/licenses/mit/)
