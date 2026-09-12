public class TestDirector {
    public Test createBeginnerJavaTest(){
        return new TestBuilder()
                .setTitle("Java Beginner Test")
                .setSubject("Java Programming")
                .setDifficulty("Easy")
                .setNumberOfQuestions(10)
                .setTimeLimit(20)
                .setQuestionType("Multiple Choice")
                .build();
    }

    public Test createAdvancedPatternTest(){
        return new TestBuilder()
                .setTitle("Design Pattern Advanced Test")
                .setSubject("Software Design Patterns")
                .setDifficulty("Hard")
                .setNumberOfQuestions(30)
                .setTimeLimit(60)
                .setQuestionType("Multiple Choice")
                .build();
    }
}