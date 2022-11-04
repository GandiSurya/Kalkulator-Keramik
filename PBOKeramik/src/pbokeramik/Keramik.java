/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbokeramik;

/**
 *
 * @author user
 */
public class Keramik {
    //membuat variabel
    private int luas_tanah, Keramik_pA, Keramik_lA, Keramik_pB, Keramik_lB, Keramik_pC, Keramik_lC ;
    
    // Luas tanah
 public void setLuasTanah(int  l){
     luas_tanah = l;
 }
 public int getLuasTanah(){
     return luas_tanah;
 }
 
 //Dus Merek A
 
 //Panjang Dus Merek A
 public void setPanjang_A(int pA){
     Keramik_pA = pA;
 }
 public int getPanjang_A(){
     return Keramik_pA;
 }
 
 //Lebar Dus Merek A
 public void setLebar_A(int lA){
     Keramik_lA = lA;
 }
 public int getLebar_A(){
     return Keramik_lA;
 }
 
//Membuat Luas Keramik Merek A
 public int luasKer_A(){
     int luas_A;
     luas_A = Keramik_pA * Keramik_lA / 100;
     return luas_A;
 }
 
 //Membuat Isi Keramik
public int isiKer_A(){
    int isi_A;
    isi_A = 16;
    return isi_A;
}

//Membuat Harga 
public int hargaKer_A(){
    int harga_A;
    harga_A = 65000;
    return harga_A;
}

//Membuat Luas total keramik A
public int luasTot_A(){
    int tot_A;
    tot_A = luasKer_A() * isiKer_A();
    return tot_A;
}

// Dus Merek B
 //Panjang Dus Merek B
 public void setPanjang_B(int pB){
     Keramik_pB = pB;
 }
 public int getPanjang_B(){
     return Keramik_pB;
 }
 
 //Lebar Dus Merek B
 public void setLebar_B(int lB){
     Keramik_lB = lB;
 }
 public int getLebar_B(){
     return Keramik_lA;
 }
 
//Membuat Luas Keramik Merek B
 public int luasKer_B(){
     int luas_B;
     luas_B = Keramik_pB * Keramik_lB / 100;
     return luas_B;
 }
 
 //Membuat Isi Keramik
public int isiKer_B(){
    int isi_B;
    isi_B = 11;
    return isi_B;
}

//Membuat Harga 
public int hargaKer_B(){
    int harga_B;
    harga_B = 92000;
    return harga_B;
}

//Membuat Luas total keramik B
public int luasTot_B(){
    int tot_B;
    tot_B = luasKer_B() * isiKer_B();
    return tot_B;
}

// Dus Merek C
 //Panjang Dus Merek C
 public void setPanjang_C(int pC){
     Keramik_pC = pC;
 }
 public int getPanjang_C(){
     return Keramik_pC;
 }
 
 //Lebar Dus Merek C
 public void setLebar_C(int lC){
     Keramik_lC = lC;
 }
 public int getLebar_C(){
     return Keramik_lC;
 }
 
//Membuat Luas Keramik Merek C
 public int luasKer_C(){
     int luas_C;
     luas_C = Keramik_pC * Keramik_lC / 100;
     return luas_C;
 }
 
 //Membuat Isi Keramik
public int isiKer_C(){
    int isi_C;
    isi_C = 4;
    return isi_C;
}

//Membuat Harga 
public int hargaKer_C(){
    int harga_C;
    harga_C = 120000;
    return harga_C;
}

//Membuat Luas total keramik C
public int luasTot_C(){
    int tot_C;
    tot_C = luasKer_C()* isiKer_C();
    return tot_C; 
}
   
// info tribut keramik
public void infoKeramik(){
    System.out.println("Luas Tanah = "+getLuasTanah()+" m2");
    System.out.println("");
    System.out.println("Keramik Merek A");
    System.out.println("Panjang = "+getPanjang_A()+" cm");
    System.out.println("Lebar = "+getLebar_A()+" cm");
    System.out.println("Luas Keramik = "+luasKer_A()+" m2");
    System.out.println("Isi Keramik = "+isiKer_A()+ " keping");
    System.out.println("Harga Satuan Dus = Rp."+hargaKer_A());
    System.out.println("Total Luas Keramik dalam Satuan Dus = "+luasTot_A()+" m2");
    System.out.println("");
    System.out.println("Keramik Merek B");
    System.out.println("Panjang = "+getPanjang_B()+" cm");
    System.out.println("Lebar = "+getLebar_B()+" cm");
    System.out.println("Luas Keramik = "+luasKer_B()+" m2");
    System.out.println("Isi Keramik = "+isiKer_B()+ " keping");
    System.out.println("Harga Satuan Dus = Rp."+hargaKer_B());
    System.out.println("Total Luas Keramik dalam Satuan Dus = "+luasTot_B()+" m2");
    System.out.println("");
    System.out.println("Keramik Merek c");
    System.out.println("Panjang = "+getPanjang_C()+" cm");
    System.out.println("Lebar = "+getLebar_C()+" cm");
    System.out.println("Luas Keramik = "+luasKer_C()+" m2");
    System.out.println("Isi Keramik = "+isiKer_C()+ " keping");
    System.out.println("Harga Satuan Dus = Rp."+hargaKer_C());
    System.out.println("Total Luas Keramik dalam Satuan Dus = "+luasTot_C()+" m2");
    System.out.println("");
}

//Jumlah dus dan harga keramik yang dibutuhkan merek A
public int hitungDus_A(){
    int dus_A;
    dus_A = getLuasTanah() * luasTot_A();
    return  dus_A;
}
public int hitungHarga_A(){
    int harga_A;
    harga_A = hitungDus_A() * hargaKer_A();
    return harga_A;
}

//Jumlah dus dan harga keramik yang dibutuhkan merek B
public int hitungDus_B(){
    int dus_B;
    dus_B = getLuasTanah()* luasTot_B();
    return dus_B;
}
public int hitungHarga_B() {
    int harga_B;
    harga_B = hitungDus_B() * hargaKer_B();
    return harga_B;
}

//Jumlah dus dan harga keramik yang dibutuhkan merek C
public int hitungDus_C(){
    int dus_C;
    dus_C = getLuasTanah() * luasTot_C();
    return  dus_C;
}
public int hitungHarga_C(){
    int harga_C;
    harga_C = hitungDus_C()* hargaKer_C();
    return harga_C;
}

//informasi jumlah dan harga yang dibutuhkan pada masing-masing merek
public void hitungHarga(){
    System.out.println("");
    System.out.println("Berikut informasi Dus dan Harga Pada Masing-Masing Merek : ");
    System.out.println("");
    System.out.println("Merek A");
    System.out.println("Jumlaah Dus yang dibutuhkan "+hitungDus_A()+" buah");
    System.out.println("Anggaran yang perlu Dipersiapkan Rp. "+hitungHarga_A());
    System.out.println("");
    System.out.println("Merek B");
    System.out.println("Jumlaah Dus yang dibutuhkan "+hitungDus_B()+" buah");
    System.out.println("Anggaran yang perlu Dipersiapkan Rp. "+hitungHarga_B());
    System.out.println("");
    System.out.println("Merek C");
    System.out.println("Jumlaah Dus yang dibutuhkan "+hitungDus_C()+" buah");
    System.out.println("Anggaran yang perlu Dipersiapkan Rp. "+hitungHarga_C());
}
}

