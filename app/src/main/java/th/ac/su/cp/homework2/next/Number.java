package th.ac.su.cp.homework2.next;
public class Number {
    public enum GuessResult {
        y_vote,n_vote,notequal
    }
    public GuessResult checkAnswer (String text) {
        GuessResult result = null;
        boolean check1 = true;
        if (text.length() == 13) {
            int countcheck1 = 0;
            char check = text.charAt(0);
            for(int i=0; i<text.length(); i++){
                if(text.charAt(i) == '1' || text.charAt(i) == '2'){
                    if(text.charAt(i) == check){
                        continue;
                    }
                    else{
                        countcheck1++;
                    }
                }
                else{
                    check1 = false;
                }
            }
            if(countcheck1 != 0 || check1 == false){result = GuessResult.notequal;}
            else{result = GuessResult.y_vote;}
        } else {
            result = GuessResult.n_vote;
        }
        return result;
    }
}
