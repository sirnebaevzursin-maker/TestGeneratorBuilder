public class Test {

    private String title;
    private String subject;
    private String difficulty;
    private int numberOfQuestions;
    private int timeLimit;
    private String questionType;

    public Test(String title,
                String subject,
                String difficulty,
                int numberOfQuestions,
                int timeLimit,
                String questionType) {

        this.title = title;
        this.subject = subject;
        this.difficulty = difficulty;
        this.numberOfQuestions = numberOfQuestions;
        this.timeLimit = timeLimit;
        this.questionType = questionType;
    }

    public void displayInfo(){

        System.out.println("===== TEST INFORMATION =====");
        System.out.println("Title: " + title);
        System.out.println("Subject: " + subject);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Questions: " + numberOfQuestions);
        System.out.println("Time limit: " + timeLimit + " minutes");
        System.out.println("Question type: " + questionType);
    }
}