/**
 * Revolution game.
 * This game will create a table which length and width is specified by the user.
 * Revolution is a game where you are given a set of ascending numbers starting
 *  at 1 that are scrambled and the user must rotate 2x2 blocks of the table
 *  until the numbers are sorted in ascending order
 *
 * ex. in a 3x3 grid sort the numbers 1-9 in order to win
 *
 * @author Justin Peasley
 */
public class Revolution {
    private int x;
    private int y;
    private final int solDepth;
    private int turnCount;

    //constructors for specified and unspecified dimensions
    public Revolution(int x, int y, int solDepth)
    {
        this.x = x; this.y = y;
        this.solDepth = solDepth;
    }

    public Revolution(int solDepth)
    {this.solDepth=solDepth;}

    //moves

    //rotateRight

    //rotateLeft

    //undo

    //isOver

    //toString override needed

    @Override
    public String toString()
    {
        String output="";
        return super.toString();
    }

    //Helper methods

    //randomRotation()

    //isValidAnchor(int x, int y)

    //copyOfGrid (deepcopy)
}
