package h20201202;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
/**
 * @ahthor : cxyxh
 * @date : 2020/12/12 10:43
 * @describetion : 默认有5种颜色，电脑随机选一种，玩家猜一种
 */
public class Question3 {

	public static void main(String[] args) {
		List<String> colorList = genColorList();
		int loopTimes = 5;
		int guessRightTimes = 0;
		boolean flag = true;
		String userInput = null;
		for (int i = 0; i < loopTimes; i++) {
			int num = genRandomInt();
			String computerSelectColor = colorList.get(num);
			while (flag) {
				userInput = getUserInput();
				boolean expect = isExpect(userInput, colorList);
				if (expect) {
					flag = false;
				} else {
					System.out.println("===Please input red, green, blue, orange, yellow===");
				}
			}
			flag = true;
			if (computerSelectColor.equalsIgnoreCase(userInput)) {
				guessRightTimes++;
				System.out.println("congratulations, you guessed it right!");
				System.out.println("the computer and your guess are " + userInput);
			} else {
				System.err.println("sorry you guessed wrong");
				System.err.println("The computer chooses " + computerSelectColor);
				System.err.println("you guessed it is " + userInput);
			}
		}
		System.out.println("you guessed it[" + guessRightTimes + "]times in total");
	}

	public static List<String> genColorList() {
		List<String> colorList = new ArrayList<String>();
		colorList.add("Red");
		colorList.add("Green");
		colorList.add("Blue");
		colorList.add("Orange");
		colorList.add("Yellow");
		return colorList;
	}

	public static int genRandomInt() {
		Random random = new Random();
		int num = random.nextInt(5);
		return num;
	}

	public static String getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("please guess the color entered by the computer:");
		String color = sc.nextLine();
		return color;
	}

	public static boolean isExpect(String userInput, List<String> colorList) {
		for (int i = 0; i < colorList.size(); i++) {
			if (colorList.get(i).equalsIgnoreCase(userInput)) {
				return true;
			}
		}
		return false;
	}
}