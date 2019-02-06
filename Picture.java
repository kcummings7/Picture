
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square house;
    private Square windowLeft;
    private Square windowRight;
    private Square doorBottom;
    private Square doorTop;
    private Square garage;
    private Square garageDoor;
    private Square treeTrunkBottom;
    private Square treeTrunkTop;
    private Square grass;
    private Triangle roof;
    private Triangle garageRoof;
    private Circle sun;
    private Circle treeLeaves1;
    private Circle treeLeaves2;
    private Circle treeLeaves3;
    private Circle treeLeaves4;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        house = new Square();
        house.moveVertical(280);
        house.moveHorizontal(200);
        house.changeSize(130);
        house.changeColor("black");
        house.makeVisible();

        windowLeft = new Square();
        windowLeft.changeSize(30);
        windowLeft.changeColor("blue");
        windowLeft.moveHorizontal(220);
        windowLeft.moveVertical(310);
        windowLeft.makeVisible();
        
        windowRight = new Square();
        windowRight.changeSize(30);
        windowRight.changeColor("blue");
        windowRight.moveHorizontal(282);
        windowRight.moveVertical(310);
        windowRight.makeVisible();
        
        garage = new Square();
        garage.changeSize(60);
        garage.changeColor("black");
        garage.moveHorizontal(330);
        garage.moveVertical(340);
        garage.makeVisible();
        
        garageDoor = new Square();
        garageDoor.changeSize(40);
        garageDoor.changeColor("yellow");
        garageDoor.moveHorizontal(340);
        garageDoor.moveVertical(360);
        garageDoor.makeVisible();
        
        treeTrunkBottom = new Square();
        treeTrunkBottom.changeSize(30);
        treeTrunkBottom.changeColor("magenta");
        treeTrunkBottom.moveHorizontal(80);
        treeTrunkBottom.moveVertical(370);
        treeTrunkBottom.makeVisible();
        
        treeTrunkTop = new Square();
        treeTrunkTop.changeSize(30);
        treeTrunkTop.changeColor("magenta");
        treeTrunkTop.moveHorizontal(80);
        treeTrunkTop.moveVertical(340);
        treeTrunkTop.makeVisible();
        
        doorBottom = new Square();
        doorBottom.changeSize(30);
        doorBottom.changeColor("yellow");
        doorBottom.moveHorizontal(250);
        doorBottom.moveVertical(370);
        doorBottom.makeVisible();
        
        doorTop = new Square();
        doorTop.changeSize(30);
        doorTop.changeColor("yellow");
        doorTop.moveHorizontal(250);
        doorTop.moveVertical(355);
        doorTop.makeVisible();
        
        grass = new Square();
        grass.changeSize(500);
        grass.changeColor("green");
        grass.moveHorizontal(-20);
        grass.moveVertical(400);
        grass.makeVisible();

        roof = new Triangle();
        roof.changeColor("red");
        roof.changeSize(50, 170);
        roof.moveHorizontal(235);
        roof.moveVertical(235);
        roof.makeVisible();
        
        garageRoof = new Triangle();
        garageRoof.changeColor("red");
        garageRoof.changeSize(30, 70);
        garageRoof.moveHorizontal(330);
        garageRoof.moveVertical(315);
        garageRoof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(370);
        sun.moveVertical(40);
        sun.changeSize(80);
        sun.makeVisible();
        
        treeLeaves1 = new Circle();
        treeLeaves1.changeColor("green");
        treeLeaves1.moveHorizontal(72);
        treeLeaves1.moveVertical(285);
        treeLeaves1.changeSize(45);
        treeLeaves1.makeVisible();
        
        treeLeaves2 = new Circle();
        treeLeaves2.changeColor("green");
        treeLeaves2.moveHorizontal(55);
        treeLeaves2.moveVertical(270);
        treeLeaves2.changeSize(45);
        treeLeaves2.makeVisible();
        
        treeLeaves3 = new Circle();
        treeLeaves3.changeColor("green");
        treeLeaves3.moveHorizontal(92);
        treeLeaves3.moveVertical(270);
        treeLeaves3.changeSize(45);
        treeLeaves3.makeVisible();
        
        treeLeaves4 = new Circle();
        treeLeaves4.changeColor("green");
        treeLeaves4.moveHorizontal(73);
        treeLeaves4.moveVertical(250);
        treeLeaves4.changeSize(45);
        treeLeaves4.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(house != null)   // only if it's painted already...
        {
            house.changeColor("black");
            windowLeft.changeColor("white");
            windowRight.changeColor("white");
            doorTop.changeColor("white");
            doorBottom.changeColor("white");
            garage.changeColor("black");
            garageDoor.changeColor("white");
            grass.changeColor("black");
            roof.changeColor("black");
            garageRoof.changeColor("black");
            sun.changeColor("black");
            treeTrunkTop.changeColor("black");
            treeTrunkBottom.changeColor("black");
            treeLeaves1.changeColor("black");
            treeLeaves2.changeColor("black");
            treeLeaves3.changeColor("black");
            treeLeaves4.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(house != null)   // only if it's painted already...
        {
            house.changeColor("black");
            windowLeft.changeColor("blue");
            windowRight.changeColor("blue");
            doorTop.changeColor("yellow");
            doorBottom.changeColor("yellow");
            garage.changeColor("black");
            garageDoor.changeColor("yellow");
            grass.changeColor("green");
            roof.changeColor("red");
            garageRoof.changeColor("red");
            sun.changeColor("yellow");
            treeTrunkTop.changeColor("magenta");
            treeTrunkBottom.changeColor("magenta");
            treeLeaves1.changeColor("green");
            treeLeaves2.changeColor("green");
            treeLeaves3.changeColor("green");
            treeLeaves4.changeColor("green");
        }
    }

}
