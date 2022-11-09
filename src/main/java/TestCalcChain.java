public class TestCalcChain {
    public static void main(String[] args) {

        Chain chainCalc1 =new AddNumbers();
        Chain chainCalc2 =new SubtractNumbers();
        Chain chainCalc3 =new MultNumbers();
        Chain chainCalc4 =new DivNumbers();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers request = new Numbers(2,4, "add");
        chainCalc1.calculate(request);

        Numbers request1 = new Numbers(2,4, "div");
        chainCalc1.calculate(request1);

        Numbers request2 = new Numbers(4,2, "div");
        chainCalc1.calculate(request2);

        Numbers request3 = new Numbers(4,2, "mult");
        chainCalc1.calculate(request3);
    }

}
