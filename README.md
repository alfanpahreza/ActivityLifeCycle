# ActivityLifeCycle

Activity Life Cycle adalah siklus dari sekumpulan aktivitas yang terjadi saat suatu aplikasi android dijalankan. Dalam aplikasi tersebut, aktivitas merupakan pekerjaan yang sedang ditampilkan oleh aplikasi dan yang menentukan tampilan awal ketika membuka aplikasi. Contohnya ketika membuka beberapa aplikasi sekaligus, user android dapat berpindah aplikasi tanpa kehilangan progress / state dari aplikasi yang lainnya, hal tersebut dikendalikan oleh activity.

![image](https://user-images.githubusercontent.com/54460781/112266371-70365200-8ca6-11eb-867d-6483fe61f4cc.png)


Terdapat beberapa metode callback sebagai states yang merupakan bagian dari Activity Life Cycle, yaitu:
- onCreate() :
  Bagian ini memanggil layout yang akan digunakan sebagai tampilan dari aplikasi (menggunakan setContentView()), bagian ini juga dapat memanggil state sebelumnya jika nilai savedInstanceState tidak NULL.
- onStart() :
  Tahapan ini memunculkan layout yang sebelumnya dipanggil sehingga dapat dilihat oleh user. Bagian ini dapat dapat digunakan untuk memanggil animasi atau elemen visual lainnya. 
- onResume() :
  Pada bagian ini activity dapat berinteraksi dengan user dan proses utama aplikasi dapat dimulai.
- onPause() :
  Dipanggil ketika keluar dari aplikasi namun aplikasi masih dapat berjalan meskipun tidak dibuka aplikasinya, tetapi onPause tidak bisa digunakan untuk melakukan penyimpanan data karena user dapat kehilangan datanya saat onResume atau onStop.
- onStop() :
  Aktivitas aplikasi tidak dapat terlihat lagi pada tahap ini, contohnya saat keluar dari aplikasi, memulai aplikasi baru, atau keluar dari kondisi onResume.
- onRestart() :
  Bagian ini memanggil kembali aktivitas yang sebelumnya ada pada bagian onStop, yang kemudian dilanjutkan oleh onStart.
- onDestroy() :
  Menutup aplikasi dan memastikan resource yang digunakan tidak dipakai oleh aplikasi lagi.

source : https://developer.android.com/guide/components/activities/intro-activities#kotlin
