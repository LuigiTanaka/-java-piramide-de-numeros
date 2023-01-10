public class App {
    public static void main(String[] args) {
        int x = 7;

        for(int i = 1; i <= x; i++) {
            String aux = "";
            for(int j = 1; j <= i; j ++) {
                aux += i;
            }
            System.out.println(aux);
        }
    }
}
