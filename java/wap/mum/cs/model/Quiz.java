package wap.mum.cs.model;

public class Quiz {
    private static String[] question = {"3, 1, 4, 1, 5, ...",
            "1, 1, 2, 3, 5, ...",
            "1, 4, 9, 16, 25, ...",
            "2, 3, 5, 7, 11, ...",
            "1, 2, 4, 8, 16, ..."};
    private static int[] answer = {9, 8, 36, 13, 32};

    private static int index = 0;
    private static int score = 0;

    public static String[] getQuestion() {
        return question;
    }

    public static int[] getAnswer() {
        return answer;
    }

    public static int getIndex() {
        return index;
    }

    public static void updateIndex(int index) {
        Quiz.index += index;
    }

    public static void updateScore(int score) {
        Quiz.score += score;
    }

    public static int getScore() {
        return score;
    }
}
