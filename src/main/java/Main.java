public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int expected = 30;

        long actual = service.calculate(1_000, true);
        System.out.println(expected + " == ? == " + actual);

        int expectedNoReg = 10;

        long actualNoReg = service.calculate(1_000, false);
        System.out.println(expectedNoReg + " == ? == " + actualNoReg);
    }
}

