import java.util.ArrayList;

/**
 * Created by wwdzhang on 12/03/2018.
 */
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<SimpleDotCom> simpleDotComArrayList = new ArrayList<SimpleDotCom>();
    private int numOfGuess;

    void setUpGame(){
        SimpleDotCom one = new SimpleDotCom();
        one.setName("The first one");
        SimpleDotCom two = new SimpleDotCom();
        two.setName("The second one");
        SimpleDotCom three = new SimpleDotCom();
        three.setName("The third one");

        simpleDotComArrayList.add(one);
        simpleDotComArrayList.add(two);
        simpleDotComArrayList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("one,two,three");
        System.out.println("Try it");

        for(SimpleDotCom dotComToSet : simpleDotComArrayList){
            ArrayList<String> newLocation = helper.placeDotcom(3);
            System.out.println(newLocation);
            dotComToSet.setLocationCells(newLocation);
        }
    }
    void startPlaying(){
        while (!simpleDotComArrayList.isEmpty()){
            String userGuess = helper.getUserInput("go fot it");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuess ++;
        String result = "miss";

        for(SimpleDotCom dotCom : simpleDotComArrayList){
            result = dotCom.checkYourself(userGuess);
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                simpleDotComArrayList.remove(dotCom);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if(numOfGuess <= 18){
            System.out.println("It only took you " + numOfGuess + " guesses.");
        }else {
            System.out.println("Took you long enough. " + numOfGuess + " guesses.");
        }
    }

}
