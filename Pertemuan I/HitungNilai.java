package pertemuan1;

public class HitungNilai {

    public void hitung(NilaiMhs mhs) {
        mhs.rata = (mhs.uts + mhs.uas) / 2;

        if (mhs.rata < 50)
            mhs.grade = "E";
        else if (mhs.rata < 60)
            mhs.grade = "D";
        else if (mhs.rata < 70)
            mhs.grade = "C";
        else if (mhs.rata < 80)
            mhs.grade = "B";
        else
            mhs.grade = "A";
    }
}