import java.util.Scanner;

public class introduceJava {

    public static void main(String[] args) {
        //    Bài 1: Nhập vào hai số a và b,và kiểm tra xem a có chia hết cho b hay không.
    /*Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number a :");
    int a = scanner.nextInt();
    System.out.println("Enter number b :");
    int b = scanner.nextInt();
    if (a % b == 0){
        System.out.println(a + " divided by all " + b);
    } else
        System.out.println(a + " not divisible by " + b);*/

//    Bài 2: Nhập tuổi và in ra kết quả nếu tuổi học sinh đó không đủ điều kiện vào học lớp 10.
    /*Scanner input = new Scanner(System.in);
    System.out.println("Enter age");
    int age = input.nextInt();
    if (age >= 15){
        System.out.println("Đủ tuổi");
    } else
        System.out.println("Cút");*/

//    Bài 3: Nhập một số nguyên bất kỳ và in kết quả ra màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 0
  /*  Scanner input = new Scanner(System.in);
    System.out.println("enter number");
    int number = input.nextInt();
    if (number > 0){
        System.out.println(number + " bigger " + 0);
    } else
        System.out.println("cut");*/

//    Bài 4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đó
   /* Scanner input = new Scanner(System.in);
    System.out.println("enter number");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int max;
    if (a > b && a > c) {
        System.out.println("max is : " + a);
    } else if (b > a && b > c){
        System.out.println("max is : " + b);
    } else
        System.out.println("max is : " + c);*/

//    Bài 5: Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ

   /* Scanner input = new Scanner(System.in);
    System.out.println("Enter score");
    double testScore = input.nextDouble();
    double midtermScore = input.nextDouble();
    double finalScore = input.nextDouble();
    double score = (testScore + midtermScore + finalScore) / 3;
    if (score >= 9.0 && score <= 10.0){
        System.out.println("excellent student " + score);
    } else if (score < 9.0 && score >= 7.0){
        System.out.println("ELLs "+ score);
    } else if (score < 7.0 && score >= 4.5){
        System.out.println("The average student "+ score);
    } else
        System.out.println("stupid "+ score);*/

//    Bài 6: Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng
    /*Scanner input = new Scanner(System.in);
    System.out.println("Enter turnover");
    int $ = input.nextInt();
    if ($ >= 1000000) {
        double commission1 = $ * 0.02;
        System.out.println("Your commission : " + commission1);
    } else if ($ >= 5000000) {
        double commission2 = $ * 0.05;
        System.out.println("Your commission : " + commission2);
    } else if ($ >= 10000000) {
        double commission3 = $ * 0.1;
        System.out.println("Your commission : " + commission3);
    } else if ($ < 1000000) {
        System.out.println("You don't get a commission");
    }*/

//    Bài 7: Tính cước điện thoại cho một hộ gia đình với các thông số đã cho
    /*Scanner input = new Scanner(System.in);
    System.out.println("Enter number of minutes of call :");
    int minute = input.nextInt();
    int callRate = 800;
    float money = minute * callRate;
    System.out.println(money + " VND ");*/

//    Bài 8: Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F
    /*Scanner input = new Scanner(System.in);
    System.out.println("Enter Celius :");
    double celius = input.nextDouble();
    double fahrenheit = celius * 9/5 + 32;
    System.out.println(fahrenheit);*/

//    Bài 9: Chuyển từ mét sang feet: ft =m * 3.2808
    /*Scanner input = new Scanner(System.in);
    System.out.println("Enter metre");
    double metre = input.nextDouble();
    double ft = metre * 3.2808;
    System.out.println("foot :" + ft);*/

//    Bài 10: Tính diện tích hình vuông khi biết cạnh a.
    /*Scanner input = new Scanner(System.in);
    System.out.println("Enter a");
    int a = input.nextInt();
    int area = a * a;
    System.out.println("Area is : " + area);*/

//    Bài 11: Tính diện tích hình  chữ nhật khi biết 02 cạnh a, b.
    /*Scanner input = new Scanner(System.in);
    System.out.println("Enter long side");
    int a = input.nextInt();
    System.out.println("Enter short side");
    int b = input.nextInt();
    int area = a * b;
    System.out.println("Area is: " + area);*/

//    Bài 12: Tính diện tích tam giác vuông khi biết 02 cạnh kề a, b.
    /*Scanner input = new Scanner(System.in);
    System.out.println("Enter a side");
    int a = input.nextInt();
    System.out.println("Enter b side");
    int b = input.nextInt();
    double area = 0.5 * (a*b);
    System.out.println("Area is : " + area);*/

//    Bài 13: Giải phương trình bậc 1.
    /*Scanner input = new Scanner(System.in);
    System.out.println("Enter number: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double x;
    if (a == 0){
        System.out.println("An inertial equation");
    } else {
        x = -b / a;
        System.out.println("The equation has only one solution : " + x);
    }*/

//    Bài 14: Giải phương trình bậc 2.
    /*Scanner input = new Scanner(System.in);
    System.out.println("Enter number: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double delta = b*b - 4 * a * c;
    double x1;
    double x2;
    if (delta > 0){
        x1 = (-b + Math.sqrt(delta)) / 2 * a;
        x2 = (-b - Math.sqrt(delta)) / 2 * a;
        System.out.println("x1 = " + x1 + "and x2 = " + x2);
    } else if (delta == 0){
        x1 = 1;
        x2 = -b / 2 * a;
        System.out.println("x1 = " + x1 + "and x2 = " + x2);
    } else
        System.out.println("An inertial equation");*/

//    Bài 15: Kiểm tra xem một số nhập vào có phải là tuổi của một người không. Một số nguyên là tuổi của một người khi nhỏ 120 và lớn hơn 0
    /*Scanner input = new Scanner(System.in);
    System.out.println("Enter number: ");
    int number = input.nextInt();
    if (number > 0 && number <= 120){
        System.out.println("Age of human : " + number);
    } else
        System.out.println("The alien :))");*/

//    Bài 9: Kiểm tra xem 3 số thực (a,b,c) nhập vào có phải là cạnh của một tam giác. Điều kiện để a,b,c là cạnh của một tam giác là:
//    a,b,c > 0
//    a + b > c
//    b + c > a
//    a + c > b
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        double a = input.nextDouble();
//        double b = input.nextDouble();
//        double c = input.nextDouble();
//        if (a > 0 && b > 0 && c > 0) {}
//        Bài 10: Viết chương trình tính giá điện.
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter kWh: ");
        double kWh = input.nextDouble();
        double money;
        if (kWh > 0 && kWh <= 50){
            money = kWh * 1860;
            System.out.println("Your money u need to pay : " + money);
        } else if (kWh >= 51 && kWh <= 100){
            money = kWh * 1866;
            System.out.println("Your money u need to pay : " + money);
        } else if (kWh >= 101 && kWh <= 200) {
            money = kWh * 2186;
            System.out.println("Your money u need to pay : " + money);
        } else if (kWh >= 201 && kWh <= 300) {
            money = kWh * 2729;
            System.out.println("Your money u need to pay : " + money);
        } else if (kWh >= 301 && kWh <= 400) {
        money = kWh * 3050;
        System.out.println("Your money u need to pay : " + money);
        } else if (kWh >= 401) {
            money = kWh * 3151;
            System.out.println("Your money u need to pay : " + money);
        }*/

//        Bài 11: Viết chương trình tính thuế thu nhập cá nhân.

}
}