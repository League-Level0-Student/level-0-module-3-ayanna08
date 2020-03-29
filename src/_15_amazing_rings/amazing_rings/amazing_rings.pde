int x1 = 950;
int x2 = 250;
int speed = 1;

void setup() {
  size(1200, 1000);
}

void draw() {
  background(255,255,255);
  noFill();
  for (int i = 500; i > 0; i-=19) {
    ellipse(x1, 300, i, i);
  }
  for (int i = 500; i > 0; i-=19) {
    ellipse(x2, 300, i, i);
  }
  x1-=speed;
  x2+=speed;
  
  if(x1<=0||x1>=width){
    speed*=-1;
  }
}
