import java.util.ArrayList;

/**
 * Created by wwdzhang on 09/03/2018.
 */
public class SimpleDotCom {
    private ArrayList<String> locationCells;
    private String name;

    public String checkYourself(String guess) {
        String result = "miss";
        int index = locationCells.indexOf(guess);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("You sunk" + name);
            } else {
                result = "hit";
            }
        }
        return result;
    }

    public void setLocationCells(ArrayList locationCells) {
        this.locationCells = locationCells;
    }

    public void setName(String name) {
        this.name = name;
    }
}
