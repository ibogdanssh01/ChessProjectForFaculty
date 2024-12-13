class Tile {
    private String position;
    private boolean isOccupied;
    private Piece Piece; //

    public Tile(String position)
    {
        this.position = position;
        this.isOccupied = false;
        this.Piece = null;
    }

    int removePiece(String position)
    {
        int flag = 0;
        if(this.isOccupied) {
            this.Piece = null;
            this.isOccupied = false;
            flag = 1;
        }
        return flag;
    }

    int addPiece(Piece piece)
    {
        int flag = 0;
        if(!this.isOccupied)
        {
            this.Piece = piece;
            this.isOccupied = true;
            flag = 1;
        }
        return flag;
    }

    String getPosition() { return this.position; }

    void setPosition(String position) { this.position = position; }

    Piece getPiece() { return this.Piece; }

    boolean isOccupied() { return this.isOccupied; }


}
