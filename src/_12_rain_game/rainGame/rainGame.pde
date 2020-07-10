int ellipseX = (int) random(800);
int ellipseY = 8;
int score = 0;
int speed = 4;

void setup() {
  
   size(800, 800);}

void draw() {
   
    background(#8DA8AA);
    fill(#A0DEFF);
    stroke(#A0DEFF);
    ellipse(ellipseX, ellipseY, 30, 30);
    ellipseY = ellipseY + speed;
    
    if(ellipseY > 700) {
      checkCatch(ellipseX); 
      ellipseY = 8;
      ellipseX = (int) random(800);
      if (speed < 20) {
        
         speed++; 
      }
    }
    
    fill(#505050);
    rect(mouseX, 700, 100, 100);
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
    if (score == 30) {
      fill(0, 0, 0);
      textSize(20);
      text("You collected 30 raindrops! You win!", 250, 250);
      stop();
    }
}
void checkCatch(int x){
         if (x > mouseX && x < mouseX + 100)
            score++;
         else if (score > 0) 
            score--;
    }
