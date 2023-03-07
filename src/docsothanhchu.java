import java.util.Scanner;

public class docsothanhchu {
    public static void main(String[] args) {
        // nhap => spell
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn: ");
        // spell >= 0,
        while (true) {
            int inputNumber = Integer.parseInt(sc.nextLine());
            if (inputNumber >= 0) {
                String result = "";
                if (inputNumber <= 13 || inputNumber == 15) {
                    switch (inputNumber) {
                        case 0:
                            result = "zero";
                            break;
                        case 1:
                            result = "one";
                            break;
                        case 2:
                            result = "two";
                            break;
                        case 3:
                            result = "three";
                            break;
                        case 4:
                            result = "four";
                            break;
                        case 5:
                            result = "five";
                            break;
                        case 6:
                            result = "six";
                            break;
                        case 7:
                            result = "seven";
                            break;
                        case 8:
                            result = "eight";
                            break;
                        case 9:
                            result = "nine";
                            break;
                        case 10:
                            result = "ten";
                            break;
                        case 11:
                            result = "eleven";
                            break;
                        case 12:
                            result = "twelve";
                            break;
                        case 13:
                            result = "thirteen";
                            break;
                        case 15:
                            result = "fifteen";
                            break;

                    }
                }
                if (inputNumber > 13 && inputNumber < 20 && inputNumber != 15) {
                    switch (inputNumber) {
                        case 14:
                            result = "four";
                            break;

                        case 16:
                            result = "six";
                            break;
                        case 17:
                            result = "seven";
                            break;
                        case 18:
                            result = "eight";
                            break;
                        case 19:
                            result = "nine";
                            break;
                    }
//                    result = result + " teen";
                    result += "teen";
                }
                if (inputNumber >= 20 && inputNumber < 100) {
                    int checkFirstNumber = inputNumber / 10;
                    int checkSecondNumber = inputNumber % 10;

                    // 24
                    // 24/10 first: 2
                    // 24/10 second: 4

                    switch (checkFirstNumber) {
                        case 2:
                            result = "twen";
                            break;
                        case 3:
                            result = "thir";
                            break;
                        case 4:
                            result = "four";
                            break;
                        case 5:
                            result = "fif";
                            break;
                        case 6:
                            result = "six";
                            break;
                        case 7:
                            result = "seven";
                            break;
                        case 8:
                            result = "eight";
                            break;
                        case 9:
                            result = "nine";
                            break;
                    }

                    result += "ty";

                    switch (checkSecondNumber) {
                        case 1:
                            result += " one";
                            break;
                        case 2:
                            result += " two";
                            break;
                        case 3:
                            result += " three";
                            break;
                        case 4:
                            result += " four";
                            break;
                        case 5:
                            result += " five";
                            break;
                        case 6:
                            result += " six";
                            break;
                        case 7:
                            result += " seven";
                            break;
                        case 8:
                            result += " eight";
                            break;
                        case 9:
                            result += " nine";
                            break;
                    }

                }
                if (inputNumber >= 100 && inputNumber < 1000) {

                    int firstNumber = inputNumber / 100; //7
                    int secondNumber = inputNumber % 100 / 10; // 3
                    int lastNumber = inputNumber % 100 - secondNumber * 10;  // 35 - 30 = 5

                    switch (firstNumber) {
                        case 1:
                            result = "one";
                            break;
                        case 2:
                            result = "two";
                            break;
                        case 3:
                            result = "three";
                            break;
                        case 4:
                            result = "four";
                            break;
                        case 5:
                            result = "five";
                            break;
                        case 6:
                            result = "six";
                            break;
                        case 7:
                            result = "seven";
                            break;
                        case 8:
                            result = "eight";
                            break;
                        case 9:
                            result = "nine";
                            break;
                    }
                    result += " hundred";
                    if (secondNumber != 0) {
                        result += " and ";
                    }
                    if (secondNumber == 1) {
                        switch (lastNumber) {
                            case 0:
                                result += " ten";
                                break;
                            case 1:
                                result += " eleven";
                                break;
                            case 2:
                                result += " twelve";
                                break;
                            case 3:
                                result += " thirteen";
                                break;
                            case 4:
                                result += " fourteen";
                                break;
                            case 5:
                                result += " fifteen";
                                break;
                            case 6:
                                result += " sixteen";
                                break;
                            case 7:
                                result += " seventeen";
                                break;
                            case 8:
                                result += " eighteen";
                                break;
                            case 9:
                                result += " nineteen";
                                break;
                        }
                    }

                    switch (secondNumber) {
                        case 2:
                            result += "twen";
                            break;
                        case 3:
                            result += "thir";
                            break;
                        case 4:
                            result += "four";
                            break;
                        case 5:
                            result += "fif";
                            break;
                        case 6:
                            result += "six";
                            break;
                        case 7:
                            result += "seven";
                            break;
                        case 8:
                            result += "eight";
                            break;
                        case 9:
                            result += "nine";
                            break;
                    }
                    if (secondNumber != 0 && secondNumber != 1) {
                        result += "ty ";
                    }
                    if (secondNumber == 0 && lastNumber != 0) {
                        result += " and ";
                    }
                    if (secondNumber != 1) {
                        switch (lastNumber) {
                            case 1:
                                result += "one";
                                break;
                            case 2:
                                result += "two";
                                break;
                            case 3:
                                result += "three";
                                break;
                            case 4:
                                result += "four";
                                break;
                            case 5:
                                result += "five";
                                break;
                            case 6:
                                result += "six";
                                break;
                            case 7:
                                result += "seven";
                                break;
                            case 8:
                                result += "eight";
                                break;
                            case 9:
                                result += "nine";
                                break;
                        }
                    }
                }
                System.out.println(result);
//                return;
            } else {
                System.out.println("Nhập lại");
            }
        }
    }
}
