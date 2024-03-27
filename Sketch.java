import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + 10 * intRow;  
        intY = 300 + 3 + 10 * intColumn; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){

    int intA = 0;
    int intB = 0;

    for(int intRowTwo = 0; intRowTwo < 30; intRowTwo++){
      for(int intColumnTwo = 0; intColumnTwo < 30; intColumnTwo++){
        intA = 303 + 10 * intRowTwo;  
        intB = 300 + 3 + 10 * intColumnTwo; 

        if ((intRowTwo % 2) == 0){
        fill(255);
        }

        else  {
          fill(0);
        }

        noStroke();
        rect(intA, intB, 5, 5);

      }
    }

  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){
    int intC = 0;
    int intD = 0;

    for(int intRowThree = 0; intRowThree < 30; intRowThree++){
      for(int intColumnThree = 0; intColumnThree < 30; intColumnThree++){
        intC = 603 + 10 * intRowThree;  
        intD = 300 + 3 + 10 * intColumnThree; 

        if ((intColumnThree % 2) == 0){
        fill(255);
        }

        else  {
          fill(0);
        }
        
        noStroke();
        rect(intC, intD, 5, 5);
      }
    }



  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    int intE = 0;
    int intF = 0;

    for(int intRowFour = 0; intRowFour < 30; intRowFour++){
      for(int intColumnFour = 0; intColumnFour < 30; intColumnFour++){
        intE = 903 + 10 * intRowFour;  
        intF = 300 + 3 + 10 * intColumnFour; 

        if ((intRowFour % 2) == 0){
        fill(255);
        }

        else  {
          fill(0);
        }

        if ((intColumnFour % 2) == 0){
          fill(0);
        }
        
        noStroke();
        rect(intE, intF, 5, 5);
      }
    }

  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){

    int intG = 0;
    int intH = 0;

    for(int intColumnFive = 0; intColumnFive < 31; intColumnFive++){
      for(int intRowFive = 0; intRowFive < intColumnFive - 1 ; intRowFive++){
        intG = 296 - 3 - 10 * intRowFive; 
        intH = 0 - 7 + 10 * intColumnFive; 

        fill(255);
        noStroke();
        rect(intG, intH, 5, 5);
      }
    }

  }

  public void draw_section6(){

    int intI = 0;
    int intJ = 0;

    for(int intColumnSix = 0; intColumnSix < 32; intColumnSix++){
      for(int intRowSix = 0; intRowSix < intColumnSix -1; intRowSix++){
        intI = 300 + 3 + 10 * intRowSix;  
        intJ = 0 - 17 + 10 * intColumnSix; 
        
        fill(255);
        noStroke();
        rect(intI, intJ, 5, 5);
      }
    }

  }

  public void draw_section7(){
    int intK = 0;
    int intL = 0;

    for(int intColumnSeven = 0; intColumnSeven < 32; intColumnSeven++){
      for(int intRowSeven = 0; intRowSeven < intColumnSeven -1; intRowSeven++){
        intK = 600 + 3 + 10 * intRowSeven;  
        intL = 300 + 13 - 10 * intColumnSeven; 
        
        noStroke();
        rect(intK, intL, 5, 5);
      }
    }
  }
  public void draw_section8(){
    int intM = 0;
    int intN = 0;

    for(int intColumnEight = 0; intColumnEight < 32; intColumnEight++){
      for(int intRowEight = 0; intRowEight < intColumnEight - 1; intRowEight++){
        intM = 1200 - 7 - 10 * intRowEight;  
        intN = 300 + 13 - 10 * intColumnEight; 
        noStroke();
        rect(intM, intN, 5, 5);
      }
    }
  }
 }







