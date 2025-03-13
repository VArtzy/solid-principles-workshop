# Software Design Principle

Dalam pengembangan perangkat lunak, **architecture** berada pada tingkat tertinggi (high-level) dan menentukan bentuk serta struktur keseluruhan perangkat lunak. Sementara itu, **desain** berada pada tingkat yang lebih rendah (low-level) dan berkaitan dengan interkoneksi antara modul serta entitas perangkat lunak seperti packages, components, dan classes.

**Software Design Principle** adalah seperangkat pedoman yang membantu menghindari desain yang buruk saat mengembangkan perangkat lunak. Menurut Robert C. Martin, ada tiga karakteristik utama dari desain yang buruk yang perlu dihindari:

## 1. Rigidity (Kekakuan)

Rigidity mengacu pada kondisi di mana suatu sistem sulit diubah, bahkan untuk perubahan yang paling sederhana. Ketika kita mencoba melakukan perubahan, perubahan tersebut seringkali memicu kebutuhan untuk mengubah bagian-bagian lain dalam modul yang saling bergantung. Akibatnya, perubahan yang seharusnya bisa dilakukan dengan cepat justru memakan waktu lebih lama dan berpotensi memengaruhi modul-modul lain yang terkait.

Contoh:  
Jika kita mengubah satu bagian kode, perubahan tersebut memerlukan penyesuaian di beberapa bagian lain, sehingga prosesnya menjadi rumit dan rentan kesalahan.

## 2. Fragility (Kerapuhan)

Fragility berkaitan erat dengan rigidity. Fragility adalah kecenderungan perangkat lunak untuk mengalami kesalahan di beberapa bagian setiap kali dilakukan perubahan. Kesalahan ini sering terjadi di area yang tidak memiliki hubungan langsung dengan area yang diubah. Hal ini membuat perbaikan menjadi lebih sulit karena perubahan kecil dapat menyebabkan masalah yang tidak terduga di bagian lain.

Contoh:  
Memperbaiki bug di satu modul justru menyebabkan bug baru di modul lain yang tidak terkait secara langsung.

## 3. Immobility (Ketidakmampuan untuk Daur Ulang)

Immobility adalah ketidakmampuan untuk menggunakan kembali kode atau modul dari proyek lain atau bahkan dari bagian proyek yang sama. Seringkali, modul yang ingin digunakan kembali memiliki terlalu banyak ketergantungan, sehingga memisahkannya menjadi tugas yang rumit dan berisiko. Akibatnya, engineer lebih memilih untuk menulis ulang kode daripada mencoba memisahkan dan menggunakan kembali modul yang sudah ada.

Contoh:  
Sebuah modul yang seharusnya bisa digunakan kembali di proyek lain ternyata memiliki terlalu banyak ketergantungan, sehingga engineer memilih untuk membuat modul baru daripada memisahkan modul tersebut.

---

### Kesimpulan

Ketiga karakteristik ini—**rigidity**, **fragility**, dan **immobility**—merupakan tanda-tanda desain yang buruk. Untuk menghindarinya, penting untuk menerapkan prinsip-prinsip desain yang baik, seperti **SOLID principles**, yang membantu menciptakan sistem yang fleksibel, mudah dipelihara, dan dapat digunakan kembali. Dengan demikian, perangkat lunak yang dikembangkan akan lebih mudah diubah, diperbaiki, dan diadaptasi untuk kebutuhan baru.
