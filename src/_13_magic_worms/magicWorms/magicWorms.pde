float ellipseX = random(800);
float ellipseY = random(800);

void setup() {
  
  size(800, 800);
  background(0, 0, 0);
}


void draw() {
  
  makeMagical();
  
  for (int i = 1; i < 301; i++)  {
    
    fill(255, 0, 0);
    ellipse(getWormX(i), getWormY(i), 10, 10);
  }
}


float frequency = 0.001;
float noiseInterval = PI;

void makeMagical() {
  
     fill( 0, 0, 0, 10 );
     rect(0, 0, 800, 800);
     noStroke();
}

float getWormX(int i) {
  
      return map(noise(i * noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  
     return map(noise(i * noiseInterval + 1 + frameCount * frequency), 0, 1, 0, height);
}
