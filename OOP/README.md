# OOP

Paradigma OOP mempermudah visualisasi kode dengan skenario kehidupan nyata. Dalam penerapannya, OOP menggabungkan fungsi-fungsi atau atribut-atribut yang memiliki kesamaan ke dalam sebuah unit yang disebut objek.

Dalam pemrograman berbasis OOP, kita akan menemui beberapa istilah seperti Class, Attribute, dan Function.

Properti atau atribut memiliki makna yang sama meskipun namanya berbeda. Biasanya, programmer menggunakan istilah atribut untuk hal-hal yang berkaitan dengan mekanisme atau proses yang dilakukan oleh objek, sedangkan istilah property digunakan untuk mendeskripsikan karakteristik objek.

Class adalah blueprint yang dapat dikembangkan untuk membuat objek. Blueprint ini merupakan template yang menjelaskan perilaku objek, baik berupa properti maupun fungsi.

![](https://d17ivq9b7rppb3.cloudfront.net/original/academy/202004081610044e0e18799a32ee7d458f1ca15b9693f6.png)

Visualisasi di atas menggambarkan konsep OOP, di mana terdapat blueprint Kucing, atribut yang dimiliki Kucing, dan kemampuan yang dapat dilakukan oleh Kucing.

Function atau fungsi adalah prosedur yang terkait dengan pesan dan objek. Ketika fungsi dipanggil, sebuah mini-program akan dijalankan. Fungsi dapat diartikan sebagai cara sederhana untuk mengatur program yang kita buat.

Contohnya, hewan memiliki beberapa perilaku atau fungsi seperti makan, berjalan, atau berkomunikasi dengan hewan lain.

## Inheritance

Konsep inheritance membantu meminimalisir penulisan kode yang berulang pada fungsi, properti, dan variabel. Inheritance memungkinkan kita mendefinisikan class (induk) ke class baru (anak) dan menggunakan member dari class yang diwariskan tersebut.

Inheritance juga dapat didefinisikan sebagai proses di mana suatu objek memperoleh sifat dan perilaku dari objek lain.

**SuperClass**

Class yang fitur-fiturnya akan diwariskan. Class ini juga dikenal sebagai Induk, Base, atau Parent Class.

**SubClass**

Anak/Children class yang mewarisi member dari SuperClass. Namun, class ini tetap dapat memiliki member sendiri selain yang diwarisi dari SuperClass.

### Single Inheritance

![](https://d17ivq9b7rppb3.cloudfront.net/original/academy/202004082056196718098881d5b29382a142eba8fe75f8.png)

Cara paling umum di mana class hanya mewarisi satu class.

### Multilevel Inheritance

![](https://d17ivq9b7rppb3.cloudfront.net/original/academy/20200408205751d7ef58eeaabd83393dcd9dd954143530.png)

Mekanisme di mana SubClass mewarisi SuperClass yang merupakan SubClass dari SuperClass lain.

### Multiple Inheritance

![](https://d17ivq9b7rppb3.cloudfront.net/original/academy/2020040821041262f2422cb20e50aeff72c7b4303723df.png)

Konsep di mana sebuah class dapat mewarisi lebih dari satu SuperClass. Namun, beberapa bahasa pemrograman seperti Java tidak mendukungnya sepenuhnya karena kompleksitas yang mungkin timbul.

### Hierarchical Inheritance

![](https://d17ivq9b7rppb3.cloudfront.net/original/academy/20200408210220d8c169491bd88f973229ac2542453dd2.png)

Jenis inheritance di mana satu SuperClass diwarisi oleh beberapa SubClass.

### Hybrid Inheritance

![](https://d17ivq9b7rppb3.cloudfront.net/original/academy/202004082102419f3803b42624a300f3ef4d56c4aea7f1.png)

Kombinasi dari beberapa jenis inheritance. Untuk menerapkannya dalam bahasa seperti Java, kita memerlukan interfaces atau protocol dalam Swift.

## Encapsulation

Encapsulation adalah proses di mana data ditempatkan dalam wadah tunggal yang disebut class. Dengan encapsulation, data dapat diisolasi dan tidak dapat diakses langsung dari luar. Ini memungkinkan kita menggunakan data tanpa perlu tahu proses di baliknya.

Encapsulation tidak menyembunyikan data, tetapi menyebabkan data tersebut tersembunyi.

## Abstraction

Abstraction adalah mekanisme di mana proses dalam objek disembunyikan. Objek hanya menyediakan apa yang benar-benar perlu digunakan.

Perbedaan Abstraction dengan Encapsulation:

- Abstraction fokus pada apa yang dilakukan objek tanpa perlu tahu bagaimana itu dilakukan. Encapsulation menyembunyikan mekanisme objek saat melakukan sesuatu.
- Encapsulation menyembunyikan data dengan menyediakan getter dan setter, sedangkan abstraction menyembunyikan implementasi dengan menggunakan abstract class, interface, dan lainnya.

### Abstraction Layer

Abstraction layer adalah mekanisme yang memisahkan dua kompleksitas sistem. Dalam komputasi, abstraction layer menyembunyikan detail implementasi yang kompleks untuk memisahkan masalah seperti interoperabilitas.

## Polymorphism

Polymorphism adalah kemampuan objek, variabel, atau fungsi untuk memiliki berbagai bentuk. Secara umum, polymorphism terjadi ketika SuperClass direferensikan ke SubClass.

## Compile-time Polymorphism

Compile-time polymorphism terjadi ketika method atau fungsi dipanggil saat kompilasi. Ini terjadi karena konsep method overloading, di mana kita bisa membuat dua atau lebih fungsi dengan jumlah, tipe, dan urutan parameter yang berbeda dalam satu class.

Contoh penerapannya:

**Parameter type**

~~~
class Arithmetic {
    func add(_ valueA: Int, _ valueB: Int) -> Int {
        return valueA + valueB
    }
    
    func add(_ valueA: UInt64, _ valueB: UInt64) -> UInt64 {
        return valueA + valueB
    }
    
    func add(_ valueA: Int, _ valueB: UInt64) -> UInt64 {
        return UInt64(valueA) + valueB
    }
    
    func add(_ valueA: UInt64, _ valueB: Int) -> UInt64 {
        return valueA + UInt64(valueB)
    }
}
~~~

**Parameter count**

~~~
class Arithmetic {
    func add(_ valueA: Int, _ valueB: Int) -> Int {
        return valueA + valueB
    }
    
    func add(_ valueA: UInt64, _ valueB: UInt64) -> UInt64 {
        return valueA + valueB
    }
    
    func add(_ valueA: Int, _ valueB: UInt64) -> UInt64 {
        return UInt64(valueA) + valueB
    }
    
    func add(_ valueA: UInt64, _ valueB: Int) -> UInt64 {
        return valueA + UInt64(valueB)
    }
}
 
class Add : Arithmetic {
    override func add(_ valueA: Int, _ valueB: Int) -> Int {
        print("Calculate!")
        return super.add(valueA, valueB)
    }
}
~~~

### Runtime Polymorphism

Runtime polymorphism terjadi ketika fungsi dipanggil saat runtime. Contohnya adalah method overriding, di mana sub class memiliki fungsi dengan nama yang sama dengan fungsi di kelas induknya.

~~~
func main() {
    let cat = Cat()
    cat.walk()
}
 
class Animal {
    func walk() {
        print("\(String(describing: type(of: self))) walk!")
    }
}
 
class Cat : Animal {
    override func walk() {
        print("Yeay! \(String(describing: type(of: self))) walked!")
    }
}
~~~
