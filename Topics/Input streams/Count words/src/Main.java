import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int counter = 0;
//        char[] arrayOfImput = input.toCharArray();
//        if (arrayOfImput.length > 0) {
//
//            counter++;
//            for (int i = 0; i < arrayOfImput.length; i++) {
//
//                if ((arrayOfImput[i] == ' ') && (arrayOfImput[i + 1] != ' ')) {
//                    counter++;
//                }
//            }
//        }

        String[] arrayOfImput = input.split(" ");
        for (String element : arrayOfImput) {
            element.trim();
            if (!element.equals("")) {
                counter++;
            }
        }

        System.out.println(counter);

        reader.close();
    }
}