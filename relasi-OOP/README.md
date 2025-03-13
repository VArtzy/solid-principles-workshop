# Relasi pada OOP

Hubungan antar objek mendefinisikan cara objek-objek tersebut berinteraksi atau berkolaborasi satu sama lain. Dalam hubungan antar objek, terdapat tiga kategori utama:

* **Association**: Hubungan "has-a" yang menunjukkan bahwa sebuah kelas memiliki hubungan dengan kelas lain.
* **Dependency**: Hubungan yang menunjukkan bahwa sebuah kelas bergantung pada kelas lain.
* **Generalization**: Hubungan "is-a" dari kelas yang spesifik ke kelas yang lebih umum.

## Association

![](https://d17ivq9b7rppb3.cloudfront.net/original/academy/20200408220115ba016e06c411662a267ee82957c09b81.png)

Asosiasi didefinisikan sebagai hubungan terstruktur antara dua komponen yang saling terhubung. Pada gambar di atas, hubungan asosiasi digambarkan dengan garis tidak putus-putus tanpa anak panah di kedua ujungnya. Setiap objek memiliki siklus hidupnya sendiri dan tidak memiliki "kepemilikan" satu sama lain.

### Kardinalitas

Hubungan asosiasi memiliki beberapa tipe kardinalitas: one-to-one, one-to-many, many-to-one, dan many-to-many.

**One-to-one relationship**

Hubungan satu ke satu terjadi ketika satu objek A memiliki referensi ke satu objek B, dan sebaliknya. Contohnya, kelas `User` hanya memiliki satu data diri.

![](https://d17ivq9b7rppb3.cloudfront.net/original/academy/2020040822081007d3f5107d6ad6c41c8287e3499beb1a.png)

**One-to-many relationship**

Hubungan satu ke banyak terjadi ketika satu objek A terhubung dengan lebih dari satu objek B, tetapi setiap objek B hanya terhubung dengan satu objek A. Contohnya, seorang pembeli dapat memiliki beberapa pesanan, sehingga kelas `User` memiliki hubungan one-to-many dengan kelas `Order`.

![](https://d17ivq9b7rppb3.cloudfront.net/original/academy/20200408220941e5064708e11dcae84073f25e6158db35.png)

**Many-to-many relationship**

Hubungan banyak ke banyak terjadi ketika setiap anggota dari objek A dan B terhubung dengan lebih dari satu anggota objek lainnya. Contohnya, seorang pengguna dapat membeli beberapa barang, dan satu barang dapat dibeli oleh beberapa pengguna.

![](https://d17ivq9b7rppb3.cloudfront.net/original/academy/20200408221052f1c7e15a1183a40b3b99336fd19b1b38.png)

Dalam hubungan asosiasi, terdapat dua bentuk relasi: **agregasi** dan **komposisi**.

### Aggregation

![](https://d17ivq9b7rppb3.cloudfront.net/original/academy/2020040822143239c50cc5834456bfb351ddbee1eb246b.png)

Agregasi adalah bentuk hubungan asosiasi yang digambarkan dengan garis tidak putus-putus dan simbol diamond putih yang mengarah ke kelas yang "memiliki". Perbedaannya dengan komposisi adalah, dalam agregasi, setiap kelas dapat berdiri sendiri. Contohnya, jika kelas `Shop` dihancurkan, kelas `Seller` masih dapat digunakan.

### Composition

![](https://d17ivq9b7rppb3.cloudfront.net/original/academy/202004082215452de88d6950ab3a492945bd009a09e967.png)

Komposisi adalah hubungan di mana sebuah kelas "memiliki" kelas lain. Hubungan ini lebih kuat daripada agregasi. Jika kelas `User` dihancurkan, kelas `Address` yang terkait juga akan hancur. Komposisi digambarkan dengan garis dan simbol diamond hitam yang mengarah ke kelas yang "memiliki".

![](https://d17ivq9b7rppb3.cloudfront.net/original/academy/20200408221938befc8a123256ab7fa8a05d7efccfd2a9.png)

Komposisi adalah bentuk hubungan terkuat, sementara agregasi lebih umum. Keduanya adalah bentuk hubungan asosiasi, di mana komposisi menunjukkan hubungan "memiliki" dan agregasi menunjukkan hubungan "menggunakan".

## Dependency

Hubungan dependensi terjadi ketika satu kelas bergantung pada kelas lain, tetapi tidak sebaliknya. Perubahan pada kelas pertama dapat memengaruhi kelas yang bergantung padanya. Hubungan ini terjadi jika:

- Sebuah fungsi pada kelas A membutuhkan kelas B sebagai parameter.
- Fungsi pada kelas A mengembalikan nilai berupa kelas B.
- Kelas A menggunakan kelas B, tetapi kelas B bukan atribut dari kelas A.

![](https://d17ivq9b7rppb3.cloudfront.net/original/academy/20200408222919f9805025821d67c40a3a89026fcbb1d2.png)

Hubungan dependensi digambarkan dengan garis putus-putus dan anak panah yang mengarah ke kelas yang bergantung. Contohnya, kelas `ShopService` bergantung pada kelas `Product`, tetapi tidak memiliki atribut berupa kelas `Product`.

~~~
class ShopService {
    func changeProductPrice(price: String, product: Product) {
        product.changePrice(price)
    }
}
 
class Product {
    private var _id: String
    private var _name: String
    private var _price: String
    
    init(id: String, name: String, price: String) {
        _id = id
        _name = name
        _price = price
    }
 
    func changePrice(_ value: String) {
        _price = value
    }
}
~~~

## Generalization and Specialization

### Generalization

![](https://d17ivq9b7rppb3.cloudfront.net/original/academy/202004082249296809bdbabc85f6dfd3aec55d00d67823.png)

Generalisasi adalah proses menggabungkan karakteristik dari dua atau lebih kelas ke dalam satu kelas yang lebih umum (SuperClass). Contohnya, kelas `Product` adalah SuperClass dari `HealthProduct`, `ElectricProduct`, dan `ConsumableProduct` karena mereka memiliki atribut dan fungsi yang sama.

### Specialization

![](https://d17ivq9b7rppb3.cloudfront.net/original/academy/202004082252495ac4f060f90fbaadcc03530a8ab4601b.png)

Spesialisasi adalah kebalikan dari generalisasi, di mana sebuah SubClass dibuat dari kelas yang sudah ada. Contohnya, jika kelas `Product` memiliki atribut yang tidak diperlukan oleh semua produk, seperti `batteryCapacity`, kita dapat memecahnya menjadi kelas `ElectronicProduct` dan `ConsumableProduct`.

~~~
protocol Product {
    var id: String { get set }
    var name: String { get set }
    var price: String { get set }
}
 
class ElectronicProduct : Product {
    var id: String
    var name: String
    var price: String
    var productionDate: String    
    init(id: String, name: String, price: String, productionDate: String) {
        self.id = id
        self.name = name
        self.price = price
        self.productionDate = productionDate
    }
}
 
class ConsumableProduct : Product {
    var id: String
    var name: String
    var price: String
    var expirationDate: String
    init(id: String, name: String, price: String, expirationDate: String) {
        self.id = id
        self.name = name
        self.price = price
        self.expirationDate = expirationDate
    }
}
~~~

## Realization atau Implementation

![](https://d17ivq9b7rppb3.cloudfront.net/original/academy/20200421084545f9a0da91f2b1678cca8e657fc298c0e5.png)

Realisasi atau implementasi adalah hubungan abstraksi antara dua kelas, di mana satu kelas mewakili interface (`ProductService`) dan kelas lainnya mewakili implementasi (`ProductServiceImpl`). Hubungan ini digambarkan dengan garis putus-putus dan simbol segitiga putih yang mengarah ke kelas yang direalisasikan.

Realisasi digunakan untuk menyempurnakan kelas, optimasi, atau transformasi. Interface realization adalah hubungan khusus antara classifier dan interface, di mana classifier mengimplementasikan kontrak yang ditentukan oleh interface.
