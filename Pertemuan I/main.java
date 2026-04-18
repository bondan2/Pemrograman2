package pertemuan1;

public class Main {
    public static void main(String[] args) {

        InputHelper input = new InputHelper();
        HitungNilai hitung = new HitungNilai();

        NilaiMhs mhs = input.inputData();
        hitung.hitung(mhs);

        System.out.println("\n=====================================");
        System.out.println("NIM\tNama\tRata\tGrade");
        System.out.println("=====================================");
        System.out.println(mhs.nim + "\t" + mhs.nama + "\t" + mhs.rata + "\t" + mhs.grade);
    }
}