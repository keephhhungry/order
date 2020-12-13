package h20201202;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/12 10:43
 * @describetion : 输入文件名称，把文件内容打印到控制台
 */
public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input the file name:");
		String fileName = sc.nextLine();
		try {
			FileReader fileReader = new FileReader("src/main/"+fileName);
			BufferedReader in = new BufferedReader(fileReader);
			String str;
			int lineNum = 1;
			while ((str = in.readLine()) != null) {
				System.out.println(lineNum + " " + str);
				lineNum++;
			}
		} catch (IOException e) {
			System.out.println("the file name input incorrectly");
		}
	}
}