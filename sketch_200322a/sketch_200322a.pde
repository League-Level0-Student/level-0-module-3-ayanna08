int x1 = 950;
int x2 = 250;

void setup() {
  size(1200, 1000);
}

void draw() {
  for (int i = 500; i > 0; i-=19) {
    if (i%2==0) {
      noFill();
    } else {
      noFill();
    }
    ellipse(x1, 30, i, i);
  }
  for (int i = 500; i > 0; i-=19) {
    if (i%2==0) {
      noFill();
    } else {
      noFill();
    }
    ellipse(x2, 300, i, i);
  }
  
}
