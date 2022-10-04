import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class CodewithHarry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner stringscanner=new Scanner(System.in);

        String input = stringscanner.nextLine();
        int number = scanner.nextInt();
        List<String> inputStringList = Arrays.asList(input.split(""));
        for (int i = 0; i < inputStringList.size(); i++) {
            if (i<=inputStringList.size()-number) {

                String value = inputStringList.get(i);
                int counter = 0;
                for (int j = i; j < i + number; j++) {
                    if (inputStringList.get(j).equals(value) ){
                        counter++;
                    }


                }
                if (counter == number) {
                    for (int j = i; j < i + number; j++) {
                        inputStringList.set(j, "null");

                    }
                }

            }
        }
        String outputString = "";
        for (String string : inputStringList) {
            if (string != "null")
                outputString += string;
        }
        System.out.println(outputString);
    }


// this method will print all the values present in the list.




}