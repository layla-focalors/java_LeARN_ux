Synthesizing 10/10 solutions (Duplicates hidden)

=======
Suggestion 1

    iny y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

=======
Suggestion 2

    iny y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

=======
Suggestion 3

    iny y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Point(" + x + ", " + y + ")";
    }

=======
Suggestion 4

    iny y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    Point(){
        this(0,0);
    }
    String getLocation(){
        return "x:"+x+",y:"+y;
    }

=======
Suggestion 5

    iny y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Point("+x+","+y+")";
    }
    public boolean equals(Object obj){
        Point p = (Point)obj;
        if(x==p.x && y==p.y) return true;
        else return false;
    }

=======
Suggestion 6

    iny y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getPointX(){
        return x;
    }
    public int getPointY(){
        return y;
    }
    public void setPointX(int x){
        this.x = x;
    }
    public void setPointY(int y){
        this.y = y;
    }
