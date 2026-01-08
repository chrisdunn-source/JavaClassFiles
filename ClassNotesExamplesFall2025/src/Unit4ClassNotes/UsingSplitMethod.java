package Unit4ClassNotes;

public class UsingSplitMethod {
    public static void main(String[] args) {
        String highScores = "Coach Dunn-100";
        String[] gameData = highScores.split("-");
        String name = gameData[0];
        String score = gameData[1];

        System.out.println(name + " has a high score of " + score);

        int scoreValue = Integer.valueOf(score);

    }
}
