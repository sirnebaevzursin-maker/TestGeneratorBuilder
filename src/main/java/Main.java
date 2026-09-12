public class Main {

    public static void main(String[] args) {
        TestDirector director = new TestDirector();

        Test beginnerTest =
                director.createBeginnerJavaTest();

        Test advancedTest =
                director.createAdvancedPatternTest();

        beginnerTest.displayInfo();

        System.out.println();

        advancedTest.displayInfo();

    }
}