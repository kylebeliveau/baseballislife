public class DrawFigures1 {
    public static void main(String[] args) {
		
	uptriangle();
	downtriangle();
		/*this 
		is 
		a comment.*/
        System.out.println();
       
       uptriangle();
        System.out.println();
		//comments have been put here.
     uptriangle();
	StarsStripes();
     uptriangle();
    }
	
	public static void uptriangle() {
		 System.out.println("  /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\")
	}
	public static void downtriangle() {
	    System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
	}
	public static void StarsStripes() {
	    System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
        System.out.println("|United|");
        System.out.println("|States|");
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
}
}
