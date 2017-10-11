public class Rectangle {
   public int length;
   public int width;
   public int extra;
   
   public Rectangle (int length, int wideth) {
      this.length = length;
	  this.width = width;
          extra=0;
	}

   public int getArea () {
      return length * width;
	}
   
   public int getPerimeter () {
      return 2 * (length + width);
	}
}

