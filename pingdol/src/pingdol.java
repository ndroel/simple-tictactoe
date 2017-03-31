import java.util.Scanner;
public class pingdol {

    static Scanner input = new Scanner(System.in);
    static char array_data[][] = new char[3][3];
    static boolean p = false, q = false;

    private static void tampilan() {
        System.out.println("*************************************************");
        System.out.println("*\t \t*\t \t*\t \t*");
        System.out.println("*\t" + array_data[0][0] + "\t*\t" + array_data[0][1] + "\t*\t" + array_data[0][2] + "\t*");
        System.out.println("*\t \t*\t \t*\t \t*");
        System.out.println("*************************************************");
        System.out.println("*\t \t*\t \t*\t \t*");
        System.out.println("*\t" + array_data[1][0] + "\t*\t" + array_data[1][1] + "\t*\t" + array_data[1][2] + "\t*");
        System.out.println("*\t \t*\t \t*\t \t*");
        System.out.println("*************************************************");
        System.out.println("*\t \t*\t \t*\t \t*");
        System.out.println("*\t" + array_data[2][0] + "\t*\t" + array_data[2][1] + "\t*\t" + array_data[2][2] + "\t*");
        System.out.println("*\t \t*\t \t*\t \t*");
        System.out.println("*************************************************");
    }

    static void mulai_permainan() {
        kosong();
        int x, y;
        char data;
        q = false;
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Pemain 2 \"O\"");
                data = 'O';
            } else {
                System.out.println("Pemain 1 \"X\"");
                data = 'X';
            }
            do {
                p = false;
                System.out.print("Masukkan Baris : ");
                x = input.nextInt();
                System.out.print("Masukkan Kolom : ");
                y = input.nextInt();
                if (x <= 0 || x > 3) {
                    System.out.println("masukkan baris dan kolom antara 1-3\n");
                    p = true;
                } else if (y <= 0 || y > 3) {
                    System.out.println("masukkan baris dan kolom antara 1-3\n");
                    p = true;
                } else if (array_data[x - 1][y - 1] != ' ') {
                    System.out.println("Sudah terisi...!\n");
                    p = true;
                }
            } while (p == true);
            array_data[x - 1][y - 1] = data;
            tampilan();
            pemenang();
            
            if (q == true) {
                System.out.println("Tanding ulang?(1.ya/2.tidak): ");
                int menu_2 = input.nextInt();
                if (menu_2 == 1) {
                    kosong();
                    tampilan();
                    mulai_permainan();
                } else {
                    break;
                }
            }
        }
        if (q == false) {
            System.out.println("SERI..!\n");
            System.out.println("Tanding ulang?(1.ya/2.tidak): ");
            int menu_2 = input.nextInt();
            if (menu_2 == 1) {
                kosong();
                tampilan();
                mulai_permainan();
            }
        }
    }

    private static void pemenang() {

        if (array_data[0][0] == 'X' && array_data[0][1] == 'X' && array_data[0][2] == 'X') {
            System.out.println("Pemain 1 menang...!!");
            q = true;
        } else if (array_data[1][0] == 'X' && array_data[1][1] == 'X' && array_data[1][2] == 'X') {
            System.out.println("Pemain 1 menang...!!");
            q = true;
        } else if (array_data[2][0] == 'X' && array_data[2][1] == 'X' && array_data[2][2] == 'X') {
            System.out.println("Pemain 1 menang...!!");
            q = true;
        } else if (array_data[0][0] == 'X' && array_data[1][1] == 'X' && array_data[2][2] == 'X') {
            System.out.println("Pemain 1 menang...!!");
            q = true;
        } else if (array_data[0][2] == 'X' && array_data[1][1] == 'X' && array_data[2][0] == 'X') {
            System.out.println("Pemain 1 menang...!!");
            q = true;
        } else if (array_data[0][2] == 'X' && array_data[1][2] == 'X' && array_data[2][2] == 'X') {
            System.out.println("Pemain 1 menang...!!");
            q = true;
        } else if (array_data[0][1] == 'X' && array_data[1][1] == 'X' && array_data[2][1] == 'X') {
            System.out.println("Pemain 1 menang...!!");
            q = true;
        } else if (array_data[0][0] == 'X' && array_data[1][0] == 'X' && array_data[2][0] == 'X') {
            System.out.println("Pemain 1 menang...!!");
            q = true;
        }
        if (array_data[0][0] == 'O' && array_data[0][1] == 'O' && array_data[0][2] == 'O') {
            System.out.println("Pemain 2 menang...!!");
            q = true;
        } else if (array_data[1][0] == 'O' && array_data[1][1] == 'O' && array_data[1][2] == 'O') {
            System.out.println("Pemain 2 menang...!!");
            q = true;
        } else if (array_data[2][0] == 'O' && array_data[2][1] == 'O' && array_data[2][2] == 'O') {
            System.out.println("Pemain 2 menang...!!");
            q = true;
        } else if (array_data[0][0] == 'O' && array_data[1][1] == 'O' && array_data[2][2] == 'O') {
            System.out.println("Pemain 2 menang...!!");
            q = true;
        } else if (array_data[2][2] == 'O' && array_data[1][1] == 'O' && array_data[0][0] == 'O') {
            System.out.println("Pemain 2 menang...!!");
            q = true;
        } else if (array_data[0][2] == 'O' && array_data[1][2] == 'O' && array_data[2][2] == 'O') {
            System.out.println("Pemain 2 menang...!!");
            q = true;
        } else if (array_data[0][1] == 'O' && array_data[1][1] == 'O' && array_data[2][1] == 'O') {
            System.out.println("Pemain 2 menang...!!");
            q = true;
        } else if (array_data[0][0] == 'O' && array_data[1][0] == 'O' && array_data[2][0] == 'O') {
            System.out.println("Pemain 2 menang...!!");
            q = true;
        }
    }

    static void kosong() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array_data[i][j] = ' ';
            }
        }
    }

    static void cara_main() {
        System.out.println("\nCara main :\n1. Besar papan permainan berukuran 3x3\n"
                + "2. Jumlah pemain dalam permainan ini 2 orang yg bermain secara bergiliran\n"
                + "3. Setiap pemain harus mengisi petak dengan simbol masing-masing, X atau O.\n"
                + "4. Setiap pemain hanya mempunyai satu kali kesempatan pada setiap giliran.\n"
                + "5. Petak yang sudah terisi simbol tidak bisa ditimpa simbol lain.\n"
                + "6. Langkah yang sudah diambil tidak dapat dibatalkan atau diganti dengan langkah yang lain.\n"
                + "7. Tujuan (goal) dari game ini adalah untuk mendapatkan deret 3 simbol yang sama secara horizontal, vertikal atau  diagonal.\n"
                + "8. Pemenang ditentukan oleh pemain yang pertama kali menyusun deret tersebut.");
    }

    static void menu() {
        int menu;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Credit/Kelompok");
            System.out.println("2. Cara Bermain");
            System.out.println("3. Mulai Permainan");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu : ");
            menu = input.nextInt();
            switch (menu) {
                case (1):
                    credit();
                    break;
                case (2):
                    cara_main();
                    break;
                case (3):
                    kosong();
                    tampilan();
                    mulai_permainan();
                    break;
                case (4):
                    System.out.println("Terima Kasih...:)");
                    break;
            }
        } while (menu != 4);
    }

    static void credit() {
        System.out.println("\nCredit/Kelompok:\n"
                + "Nama\t: Bahruddin El-Hayat\n"
                + "NIM\t: 145150200111045\n"
                + "TTL\t: Lamongan, 14 april 1996\n"
                + "Asal\t: Lamongan\n"
                + "\n"
                + "Nama\t: Maulana Aditya Rahman\n"
                + "NIM\t: 145150201111029\n"
                + "TTL\t: Jombang, 09 September 1997\n"
                + "Asal\t: Jombang\n"
                + "\n"
                + "Nama\t: M.Brilian Misbah Alhakim\n"
                + "NIM\t: 145150201111033\n"
                + "TTL\t: Brebes, 05 Maret 1997\n"
                + "Asal\t: Bumiayu\n"
                + "\n"
                + "Nama\t: Muhammad Ilham Akbar\n"
                + "NIM\t: 145150200111038\n"
                + "TTL\t: Banjarmasin, 06 Februari 1996\n"
                + "Asal\t: Banjarmasin");
    }

    public static void main(String[] args) {
        System.out.println("****************************************************");
        System.out.println("\t\t Game Pingdol");
        System.out.println("####################################################");
        menu();
    }
}
