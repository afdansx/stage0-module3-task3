package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        //write code here
        int first = 1;
        int linkToFirst = first;
        int second = 10;
        int linkToSecond = second;
        int third = 100;
        int linkToThird = third;
        first = 15;
        second = 6;
        third = 4;

        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);

    }
}




