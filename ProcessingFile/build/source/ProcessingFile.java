import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class ProcessingFile extends PApplet {

public void setup() {
  
}
public void draw(){
  background(2,2,2);
  ellipse(250,250,20,20);
}
  public void settings() {  size(500,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ProcessingFile" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
