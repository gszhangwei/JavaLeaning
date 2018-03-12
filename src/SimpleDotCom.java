import java.util.ArrayList;

/**
 * Created by wwdzhang on 09/03/2018.
 */
public class SimpleDotCom {
    private ArrayList locationCells;
    private int numOfHits;

    public int getNumOfHits() {
        return numOfHits;
    }

    public String checkYourself(String guess){
            int index = locationCells.indexOf(Integer.parseInt(guess));
            if(index != -1){
                locationCells.remove(index);
                numOfHits ++;
                return numOfHits == 3 ? "kill" :"hit";
            }
        return "miss";
    }

    public void setLocationCells(ArrayList<Integer> locationCells) {
        this.locationCells = locationCells;
    }

    public void setNumOfHits(int numOfHits) {
        this.numOfHits = numOfHits;
    }
}
