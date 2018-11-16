package coding.section5;

/**
 * Created by Administrator on 2018/11/12 0012.
 */
public class SimpleDotCom {
    public int[] cellLocation;
    public int hitNum=0;

    public String checkYourself(int guess){
        String result="miss";

        for(int cell:this.cellLocation){
            if(cell == guess){
                result="hit";
                this.hitNum++;
                break;
            }
        }

        if(this.hitNum == this.cellLocation.length){
            result="kill";
        }

        return result;
    }

    public void setLocations(int[] cellLocation){
        this.cellLocation=cellLocation;
    }
}
