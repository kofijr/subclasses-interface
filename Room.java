public class Room{
	private double width;
 	private double length;
	private  int floor;

public Room(){
	 width = 10;
	 length = 12.5;
	 floor = 1;
}

public double getWidth() {
    	return width; }


public void setWidth(double newWidth) {
	if(newWidth <= 0)
{ 
}
  else{ 
	this.width = newWidth; 
      }
}

public double getLength() {
	return length;}


public void setLength( double newLength) {
	if (newLength <= 0)
{
}
   else{
	this.length = newLength;
       }
}

public int getFloor() {
	return floor;
}

public void setFloor( int newFloor) {
	this.floor = newFloor;
}
}


public Room(double length, double width ,int floor){
	double newLength;
	double newWidth;
	int newFloor;
}


public static void main(String [] args){
	Room myRoom = new Room(12.5,10.0,1);
	System.out.println(myRoom.double newLength + myRoom.double newWidth + myRoom.int newFloor);
}


public String toString(){
  	return "length * width on floor floor";
	


}



public String compareTo(){



}

String [] { floor , length, width};
Array.sort(roomMembers);
System.out.println(Array.toString(roomMenbers));














