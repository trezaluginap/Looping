public class Looping {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 7; i++) {
            System.out.println("Saya semangat belajar java " + i );
        }
        
        System.out.println("\nLooping deret angka: 1 3 5 7 9 11");
        
        for (int i = 1; i <= 11; i += 2) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nLooping deret angka: 9 6 3 0 -3 -6");
        
        for (int i = 9; i >= -6; i -= 3) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nLooping perkalian");
        
        int base = 4;
        for (int i = 1; i <= 4; i++) {
            System.out.println(base + " x " + i + " = " + (base * i));
        }
        
        System.out.println("\nClass untuk perkalian dengan inputan base, start, dan jumlah loop");
        
        MultiplicationTable table = new MultiplicationTable(99, 20, 5);
        table.printTable();
    }
}

class MultiplicationTable {
    private int base;
    private int start;
    private int loop;

    public MultiplicationTable(int base, int start, int loop) {
        this.base = base;
        this.start = start;
        this.loop = loop;
    }

    public void printTable() {
        for (int i = start; i < start + loop; i++) {
            System.out.println(base + " x " + i + " = " + (base * i));
        }
    }
}
