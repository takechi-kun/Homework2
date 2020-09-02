package th.ac.su.cp.homework1.next;

public class Number {
    public enum GuessResult {
        y_vote,n_vote,notequal
    }
    public GuessResult checkAnswer (String text) {
        GuessResult result = null;
        if (text.length() == 13) {
            int countcheck1 = 0;
            char check = text.charAt(0);
            for(int i=0; i<text.length(); i++){
                if(text.charAt(i) == check){
                    continue;
                }
                else{
                    countcheck1++;
                }
            }
            if(countcheck1 == 0){result = GuessResult.y_vote;}
            else{result = GuessResult.notequal;}


        } else {
            result = GuessResult.n_vote;
        }
        return result;
    }
}
