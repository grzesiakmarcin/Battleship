import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int number = 0;
        char[] arrayOfImput = input.toCharArray();
        if (arrayOfImput.length > 0) {
            number++;
            for (int i = 0; i < arrayOfImput.length; i++) {

                if ((arrayOfImput[i] == ' ') && (arrayOfImput[i + 1] != ' ')) {
                    number++;
                }
            }
        }

        System.out.println(number);

        reader.close();
    }
}