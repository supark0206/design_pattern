package observer.ch01;

public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        DataSheetView dataSheetView = new DataSheetView(scoreRecord,3);

        scoreRecord.setDataSheetView(dataSheetView);

        for (int index = 1;index<=5;index++){
            int score = index*10;
            System.out.println("adding " + score);
            scoreRecord.addScore(score);
        }
    }

}
