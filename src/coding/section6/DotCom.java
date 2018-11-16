package coding.section6;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/11/13 0013.
 */
public class DotCom {
    private String dotComName;
    private ArrayList<String> cellLocations;
    private int hitNum=0;

    public String checkYourself(String guess){
        if(this.cellLocations == null){
            return "not set dotcom location!";
        }
        String result="miss";
        for (String cell:this.cellLocations){
            if(cell.equals(guess)){
                this.hitNum++;
                result="hit";
                this.cellLocations.remove(cell);

                break;
            }
        }
        if(this.hitNum == 3){
            result="kill";
        }

        return result;
    }

    public void setCellLocations(ArrayList<String> cellLocations) {
        this.cellLocations = cellLocations;
    }

    public void setDotComName(String dotComName) {
        this.dotComName = dotComName;
    }

    public String getDotComName() {
        return dotComName;
    }

    public ArrayList<String> getCellLocations() {
        return cellLocations;
    }
}
