import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        char[] array = input.toCharArray();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }

        reader.close();
    }
}