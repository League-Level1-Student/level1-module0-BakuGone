float ellipseX = random(790);
float ellipseY = random(790);
float frequency = .001;
float noiseInterval = PI;

void setup(){
  
  size(800,  800);
  background(0, 0, 0); 
}


void draw(){
  
  makeMagical();
  
  for (int i = 0; i < 301; i++) {
   
    ellipse(getWormX(790), getWormY(790), 15, 15);
  }
}


 void makeMagical() {
   
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
  
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  
    return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
 }
