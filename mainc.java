
public class cirlcle{
    private double x,y,r ;
    public circle(double x,double y, double r){
        this.x=x;
        this.y=y;
        this.r=r;
    } //CONSTRUCTOR
   
    public double getX(x){ //get x
        return x ;

    }
    public void setX(x){// set x
        this.x=x;
    }
    public double getY(y){//get y
        return y;
    }
    public void setY(y){
         this.y=y;
         //set y
    }
    public double getR(r){//get r
        return r;
    }
    public void setR(r){
         this.r=r;
         //set y
    }
 
}
class main{
    public static void main(string[] arg){
        circle c1 = new circle(1,2,3);
        circle c2 = new circle(5,9,1);
        // change x
        double tempx=c1.getX()
        c1.setX(c2.getX())
        c2.setX(tempx) 
        //change y
        double tempy=c1.getY()
        c1.setY(c2.getY())
        c2.setY(tempy)
          }

}


public class point{
    private double x,y ;
    public point(double x,double y){
        this.x=x;
        this.y=y;
    } //CONSTRUCTOR
   
    public double getX(){ //get x
        return x ;

    }
    public void setX(x){// set x
        this.x=x;
    }
    public double getY(){//get y
        return y;
    }
    public void setY(double y){
         this.y=y;
         //set y
    }





public class CircleV2{
    private point c ; //aggregation
    private double r ;
    public CircleV2(point c,double r){
        this.c=c;
        this.r=r;
    } //CONSTRUCTOR

    public double getX(){
        return this.c.getX();
    }
    public double getY(){
        return this.c.getY();
    }
    public double setY(double y){
        return this.c.setY(y);
    }
    public double setX(double x){
        return this.c.setX(x);
    }
   
   
    public point getC(){ //get c
        return c ;

    }
    public void setC(Point c){// set c
        this.c=c;
    }
    public double getR(){//get y
        return r;
    }
    public void setR(r){
         this.r=r;
         //set y
    }
}