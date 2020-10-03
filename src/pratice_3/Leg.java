package pratice_3;

public class Leg {
    private int length; // length of leg
    private int position; // position of leg
    private int footSize; // foot size of the leg

    /** Creates a new instance of Leg
     * @param length - the length of leg
     * @param position - the position of the leg
     * @param footSize - the footSize of the leg
     **/
    public Leg(int length, int position, int footSize) {
        this.length = length;
        this.position = position;
        this.footSize = footSize;
    }

    // method to move the legs
    public int run(int step){
        position = step + 2;
        return position;
    }

}
