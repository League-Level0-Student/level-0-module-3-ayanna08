void setup(){
  size(800,600);
}

void draw(){
  for (int i = 500; i > 0; i-=51) {
  if(i%2==0){
    fill(255,0,0);
}
  else{
    fill(0,0,0);
}
  ellipse(400,300,i,i);
  
  }
}
