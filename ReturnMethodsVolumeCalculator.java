/*
name: Yujin Bae
date: October 21, 2020
teacher: <r. Guglie;lmi
describtion: This prograsm will use a return method to calculate the volume of a cylinder, pyramid, or cone.
The shpae and the dimensions will be given by the user.
*/

// The "ReturnMethodsVolumeCalculator" class.
import java.awt.*;
import hsa.Console;

public class ReturnMethodsVolumeCalculator
{
    //varaible declaration section
    Console c;            // The output console
    static boolean exit;  // If the user wants to exit, this boolean will be true.
    char shape;           // The shape that the user has chosen
    double radius;        // The radius or the lenght of the shpape
    double height;        // The height of the shape


    //the constructor
    public ReturnMethodsVolumeCalculator ()
    {
	c = new Console ("Volume Calculator"); //creates a new console
    }


    //method to print out the title of the program.
    private void title ()
    {

	c.clear ();
	c.print (' ', 32);
	c.println ("Volume Calculator");
	c.println ();
    }


    //method to pause the program until a keypress.
    private void pauseProgram ()
    {
	c.println ("Press any key to continue. ");
	c.getChar ();
    }


    //the method to display the title screen with graphics for a few seconds
    public void splashScreen ()
    {
	//the blue background
	c.setColor (Color.blue);
	c.fillRect (25, 25, 605, 466);

	//the title
	c.setColor (Color.white);
	c.setFont (new Font ("Arial", Font.BOLD, 30));
	c.drawString ("Volume Calculator", 190, 240);

	//drawing of a pyramid
	c.drawLine (100, 100, 50, 200);
	c.drawLine (50, 200, 150, 200);
	c.drawLine (150, 200, 100, 100);
	c.drawLine (150, 200, 190, 150);
	c.drawLine (190, 150, 100, 100);
	c.drawLine (50, 200, 90, 150);
	c.drawLine (90, 150, 190, 150);
	c.drawLine (90, 150, 100, 100);

	//drawing of a cone
	c.drawOval (200, 400, 150, 50);
	c.drawLine (200, 425, 275, 300);
	c.drawLine (275, 300, 350, 425);

	//drawing of a sphere
	c.drawOval (450, 75, 150, 150);
	c.drawOval (450, 125, 150, 50);

	//displays the graphics for 3 seconds
	try
	{
	    Thread.sleep (3000);
	}
	catch (Exception e)
	{
	}
    }


    //the method to draw the title and explain how the program works
    public void instructions ()
    {
	title ();
	c.println ("This program will ask you for the dimensions of a pyramid, a cylinder, or a cone. And calculate the volume of your chosen shape. ");
	c.println ();

	//waits fro a key press before moving on
	pauseProgram ();
    }


    //method to ask the user to quit or to continue
    public void mainMenu ()
    {
	//variable declaration
	String str;     //the variable to store the input befroe errortrapping.

	title ();

	//asks the user if they wish to continue or exit.
	do
	{
	    //takes in a new input
	    c.setCursor (4, 1);
	    c.println ();

	    c.setCursor (3, 1);
	    c.println ("Type in 'c' to continue, or 'q' to quit the program. ");
	    str = c.readLine ();
	    c.println ();

	}
	while (str.charAt (0) != 'q' && str.charAt (0) != 'c'); //the loop continues until exit is set to a correct value
	//if the user wishes to exit, the boolean exit is set to be true.
	if (str.charAt (0) == 'q')
	    exit = true;
    }


    //method to ask the user for input and read input
    public void askData ()
    {
	//variable declaration
	boolean error = true;    //the variable for the error trapping loop to know whether there is an error or not
	String str;              // The variable for storing an input befroe errortrapping it.

	title ();

	//asks the user for a shape
	do
	{
	    c.setCursor (4, 1);
	    c.println ();

	    c.setCursor (3, 1);

	    c.println ("Type in 'p' for a pyramid, 'c' for a cylinder, or 'o' for a cone. ");
	    str = c.readLine ();
	    c.println ();

	    shape = str.charAt (0);
	}
	while (shape != 'p' && shape != 'c' && shape != 'o');      //the loop continues if the input is neither "p" or "c" or "o"



	//If the shape is a pyramid:
	if (shape == 'p')
	{
	    //asks the user for ther side length of the pyramid
	    do
	    {
		try
		{
		    c.println ("Please type in the base side length of the pyramid. ");
		    str = c.readLine ();
		    radius = Double.parseDouble (str);
		    error = false; //proper input
		}
		catch (NumberFormatException e)  //improper input
		{
		    //deletes the improper answer
		    c.setCursor (7, 1);
		    c.println ();

		    //takes in a new input
		    c.setCursor (6, 1);
		    c.print ("Not a number. Try again. ");
		    error = true;

		}
	    }
	    while (error);

	    //asks the user for the height of the [yramid
	    do
	    {

		try
		{
		    c.println ("Please type in the height of the pyramid. ");
		    str = c.readLine ();
		    height = Double.parseDouble (str);
		    c.println ();
		    error = false; //proper input
		}
		catch (NumberFormatException e)  //improper input
		{
		    //deletes the improper answer
		    c.setCursor (9, 1);
		    c.println ();

		    //takes in a new input
		    c.setCursor (8, 1);
		    c.print ("Not a number. Try again. ");
		    error = true;

		}
	    }
	    while (error);
	}

	//If the shape is a cylinder:
	if (shape == 'c')
	{
	    //asks the user for ther radius of a cylinder
	    do
	    {
		try
		{
		    c.println ("Please type in the radius of the cylinder. ");
		    str = c.readLine ();
		    radius = Double.parseDouble (str);
		    error = false; //proper input
		}
		catch (NumberFormatException e)  //improper input
		{
		    //deletes the improper answer
		    c.setCursor (7, 1);
		    c.println ();

		    //takes in a new input
		    c.setCursor (6, 1);
		    c.print ("Not a number. Try again. ");
		    error = true;

		}
	    }
	    while (error);

	    //asks the user for the height of the cylinder
	    do
	    {

		try
		{
		    c.println ("Please type in the height of the cylinder. ");
		    str = c.readLine ();
		    height = Double.parseDouble (str);
		    c.println ();
		    error = false; //proper input
		}
		catch (NumberFormatException e)  //improper input
		{
		    //deletes the improper answer
		    c.setCursor (9, 1);
		    c.println ();

		    //takes in a new input
		    c.setCursor (8, 1);
		    c.print ("Not a number. Try again. ");
		    error = true;
		}
	    }
	    while (error);
	}

	//If the shape is a cone:
	if (shape == 'o')
	{
	    //asks the user for ther radius of a cone
	    do
	    {
		try
		{
		    c.println ("Please type in the radius of the cone. ");
		    str = c.readLine ();
		    radius = Double.parseDouble (str);
		    error = false; //proper input
		}
		catch (NumberFormatException e)  //improper input
		{
		    //deletes the improper answer
		    c.setCursor (7, 1);
		    c.println ();

		    //takes in a new input
		    c.setCursor (6, 1);
		    c.print ("Not a number. Try again. ");
		    error = true;

		}
	    }
	    while (error);

	    //asks the user for the height of the cone
	    do
	    {

		try
		{
		    c.println ("Please type in the height of the cone. ");
		    str = c.readLine ();
		    height = Double.parseDouble (str);
		    c.println ();
		    error = false; //proper input
		}
		catch (NumberFormatException e)  //improper input
		{
		    //deletes the improper answer
		    c.setCursor (9, 1);
		    c.println ();

		    //takes in a new input
		    c.setCursor (8, 1);
		    c.print ("Not a number. Try again. ");
		    error = true;

		}
	    }
	    while (error);
	}
    }


    //method to calculate the volume of a given shape and return it
    //char s = the shape chosen by the user
    //double d1 = the radius or the length of the shape
    //double d2 = the height of the shape
    //returns the volume of the shape
    private double yourReturnMethod (char s, double d1, double d2)
    {
	//variable declaration
	double volume;  //the variable to store the volume of the given shape

	//if the shape is a pyramid
	if (s == 'p')
	{
	    volume = d1 * d1 * d2 / 3;
	}

	//if the shape is a cylinder
	else if (s == 'c')
	{
	    volume = Math.PI * d1 * d1 * d2;
	}

	//if the shape is a cone
	else
	{
	    volume = Math.PI * d1 * d1 * d2 / 3;
	}

	//returns the volume
	return volume;
    }


    //method to display the original input and the calculated volume
    public void display ()
    {
	title ();

	//outputs if the shape is a pyramid
	if (shape == 'p')
	{
	    //the original inputs
	    c.print ("The Volume of a pyramid with the base lenght of ");
	    c.print (radius);
	    c.print (" units and the height of ");
	    c.print (height);
	    c.println (" units is...");
	    //outputs the calculated volume
	    c.print (yourReturnMethod ('p', radius, height));
	    c.println (" units cubed. ");
	    c.println ();
	}

	//if the shape is a cylinder
	else if (shape == 'c')
	{
	    //the original inputs
	    c.print ("The Volume of a cylinder with the radius of ");
	    c.print (radius);
	    c.print (" units and the height of ");
	    c.print (height);
	    c.println (" units is...");
	    //outputs the calculated volume
	    c.print (yourReturnMethod ('c', radius, height));
	    c.println (" units cubed. ");
	    c.println ();
	}

	//if the shape is a cone
	else
	{
	    //the original inputs
	    c.print ("The Volume of a cone with the raidus of ");
	    c.print (radius);
	    c.print (" units and the height of ");
	    c.print (height);
	    c.println (" units is...");
	    //outputs the calculated volume
	    c.print (yourReturnMethod ('p', radius, height));
	    c.println (" units cubed. ");
	    c.println ();
	}
	//waits for a key press before moving on
	pauseProgram ();
    }


    //method to say goodbye and exit the program
    public void goodbye ()
    {
	title ();
	c.println ("Thanks for using my program. Goodbye!");
	c.println ();

	//waits for a key press before exiting the program.
	pauseProgram ();

	System.exit (0);
    }


    //the main method of the program
    public static void main (String[] args)
    {
	ReturnMethodsVolumeCalculator r = new ReturnMethodsVolumeCalculator ();

	r.splashScreen ();
	r.instructions ();
	//while the user wishes to continue, the main menu will appear over and over again
	while (!exit)
	{
	    r.mainMenu ();
	    //if the user wishes to quit, the askData and display are skipped
	    if (!exit)
	    {
		r.askData ();
		r.display ();
	    }
	}
	r.goodbye ();
	
    } // main method
} // ReturnMethodsVolumeCalculator class


