
    private String difficulty;
    private int numberOfQuestions;
    private int timeLimit;
    private String questionType;
    public TestBuilder setTitle(String title){
        this.title = title;
        return this;
    }
    public TestBuilder setSubject(String subject){

        this.subject = subject;
        return this;
    }

    public TestBuilder setDifficulty(String difficulty){

        this.difficulty = difficulty;
        return this;
    }

    public TestBuilder setNumberOfQuestions(int numberOfQuestions){

        this.numberOfQuestions = numberOfQuestions;
        return this;
    }

    public TestBuilder setTimeLimit(int timeLimit){

        this.timeLimit = timeLimit;
        return this;
    }

    public TestBuilder setQuestionType(String questionType){

        this.questionType = questionType;
        return this;
    }

    public Test build(){

        if(title == null || subject == null){

            throw new IllegalStateException(
                    "Title and subject are required!"
            );
        }

        return new Test(
                title,
                subject,
                difficulty,
                numberOfQuestions,
                timeLimit,
                questionType
        );
    }
}
