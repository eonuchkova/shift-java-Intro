public class LogicalOperationTable {
    public static void main(String[] args) {

        System.out.println("Таблица истинности");
                System.out.println("P\t\t\tQ\t\t\tP AND Q\t\tP OR Q\t\tP XOR Q\t\tNOT P");

        for (int a = 0; a <= 1; a++) {
            for (int b = 0; b <= 1; b++) {

                boolean p = (b == 1);
                boolean q = (a == 1);
                boolean and = p && q;
                boolean or = p || q;
                boolean xor = p ^ q;
                boolean notP = !p;

                System.out.println(p + "\t\t" + q + "\t\t" + and + "\t\t" + or + "\t\t" + xor + "\t\t" + notP);
            }
        }
    }
}