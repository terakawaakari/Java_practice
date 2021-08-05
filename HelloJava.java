class HelloJava {
  public static void main(String[] args){
    // 文字列を表示する
    System.out.println("Hello! I'm RecurrentTechnology");

    // for文
    for ( int number = 1; number <=5; number ++) {
      System.out.println(number);
    }
    int sum = 0;
    for (int number = 1; number <= 10; number++) {
      sum += number;
    }
    System.out.println("sum:" + sum);

    // 九九
    for (int number1 = 1; number1 <= 9; number1 ++) {
      for (int number2 = 1; number2 <= 9; number2++) {
        System.out.print("" + number1 + "x" + number2 + "=" + (number1 * number2) + " ");       
      }
      System.out.println("");
    }

    // do while文
    int number = 1;
    do {
      number ++;
      System.out.println("number =" + number);
    } while (number < 5);
  }
}