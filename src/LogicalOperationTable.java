public class LogicalOperationTable {
    public static void main(String[] args) {

        System.out.println("Таблица истинности");
                System.out.println("P\t\t\tQ\t\t\tP AND Q\t\tP OR Q\t\tP XOR Q\t\tNOT P");

        for (int a = 0; a <= 1; a++) {
            for (int b = 0; b <= 1; b++) {

                boolean P = (b == 1);
                boolean Q = (a == 1);
                boolean and = P && Q;
                boolean or = P || Q;
                boolean xor = P ^ Q;
                boolean notP = !P;

                System.out.println(P + "\t\t" + Q + "\t\t" + and + "\t\t" + or + "\t\t" + xor + "\t\t" + notP);
            }
        }
    }
}