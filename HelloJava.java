class HelloJava {
  public static void main(String[] args){
    // 文字列を表示する
    System.out.println("Hello! I'm RecurrentTechnology");

    // 繰り返し文
    for ( int number = 1; number <=5; number ++) {
      System.out.println(number);
    }
    int sum = 0;
    for (int number = 1; number <= 10; number++) {
      sum += number;
    }
    System.out.println("sum:" + sum);
  }
}