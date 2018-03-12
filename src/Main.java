import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom dotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        ArrayList location = new ArrayList();
        location.add(randomNum);
        location.add(randomNum+1);
        location.add(randomNum+2);
        dotCom.setLocationCells(location);
        boolean isAlive = true;
        while (isAlive){
            String guess = helper.getUserInput("enter a number");
            String result = dotCom.checkYourself(guess);
            System.out.println(result);
            numOfGuess ++;
            if(result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuess + " guesss");
            }
        }
    }
}
