package JavaProgrammingLab;

import java.util.Scanner;


class AddZeroException extends Exception {
	public AddZeroException() {
		
	}
}

class SubtractZeroException extends Exception {
	public SubtractZeroException() {
		
	}
}

class OutOfRangeException extends Exception {
	public OutOfRangeException() {
		
	}
}

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		try {
			if(input.contains("+")) {
				int opNum = input.indexOf("+");
				String firstNumStr = input.substring(0, opNum);
				int firstNum = Integer.parseInt(firstNumStr);
				String lastNumStr = input.substring(opNum + 1);
				int lastNum = Integer.parseInt(lastNumStr);
				if(firstNum == 0 || lastNum == 0) {
					throw new AddZeroException();
				}
				else if(firstNum > 1000 || lastNum > 1000) {
					throw new OutOfRangeException();
				}
				else {
					System.out.println(firstNum + lastNum);
				}
			}
			else {
				int opNum = input.indexOf("-");
				String firstNumStr = input.substring(0, opNum);
				int firstNum = Integer.parseInt(firstNumStr);
				String lastNumStr = input.substring(opNum + 1);
				int lastNum = Integer.parseInt(lastNumStr);
				if(firstNum == 0 || lastNum == 0) {
					throw new SubtractZeroException();
				}
				else if(firstNum > 1000 || lastNum > 1000) {
					throw new OutOfRangeException();
				}
				else {
					System.out.println(firstNum - lastNum);
				}
			}
		} catch(AddZeroException e1) {
			System.out.println("AddZeroException");
		} catch(SubtractZeroException e2) {
			System.out.println("SubtractZeroException");
		} catch(OutOfRangeException e3) {
			System.out.println("OutOfRangeException");
		}
	}

}
