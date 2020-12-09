package h202011.homework1;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Builder("i79900k", "三星")
                .setDisplay("三星24寸")
                .setKeyboard("罗技")
                .setUseCount(2)
                .build();
        System.out.println(computer.toString());
    }
}
