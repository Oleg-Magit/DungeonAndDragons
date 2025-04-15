package game.map;

public class Position {
    private int row;
    private int col;
    public Position(int row,int col){
        this.row=row;
        this.col=col;
    }
    public int distanceTo(Position other)
    {
        return Math.abs(this.row-other.row)+Math.abs(this.col-other.col);

    }
    @Override
    public boolean equals(Object o)
    {
        if(this==o){return true;}
        if(!(o instanceof Position)) return false;
        Position other = (Position) o;
        return this.row == other.row && this.col== other.col;



    }

    {

    }

}
