int imageAngle = 0;
import ddf.minim.*;
PImage pictureOfRecord;  
Minim minim;
AudioPlayer song;

void setup() {                      
    size(800,800);                                
    pictureOfRecord = loadImage("record.jpg"); 
    minim = new Minim(this);
    song = minim.loadFile("awesomeTrack.mp3", 512);
  }

void rotateImage(PImage image, int amountToRotate) {
       translate(width/2, height/2);
       rotate(amountToRotate*TWO_PI/360);
       translate(-image.width/2, -image.height/2);
}

void draw() {
     
  if (mousePressed) { 
    song.play();
    imageAngle = imageAngle + 50;
    rotateImage(pictureOfRecord, imageAngle);
  }
  else {
   
    song.pause();
  }
    image(pictureOfRecord, 0, 0);
}  
