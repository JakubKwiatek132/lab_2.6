class Main {
  public static void main(String[] args) {
    for(int i = 0; i<301; i++){
      if(i%20 ==0){
      System.out.println("Temperatura C: " + i);
      System.out.println("Temperatura F: " + ((i*9/5)+32));
      }
    }
  }
}