package pertemuan1;

import java.util.Scanner;

public class InputHelper {
    Scanner input = new Scanner(System.in);

    public NilaiMhs inputData() {
        NilaiMhs mhs = new NilaiMhs();

        System.out.print("NIM: ");
        mhs.nim = input.next();

        input.nextLine(); // 🔥 FIX BUFFER

        System.out.print("Nama: ");
        mhs.nama = input.nextLine(); // bisa pakai spasi

        System.out.print("Nilai UTS: ");
        mhs.uts = input.nextDouble();

        System.out.print("Nilai UAS: ");
        mhs.uas = input.nextDouble();

        return mhs;
    }
}