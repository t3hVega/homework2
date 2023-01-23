public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1:");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Задача 2:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("Задача 3:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4 - 3.5;
        System.out.println(dog);
        cat = cat + 4 - 1.6;
        System.out.println(cat);
        paper = paper + 4 - 7639;
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("Задача 4:");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача 5:");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача 6:");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var overallWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(overallWeight);
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println(weightDifference);
    }
    public static void task7() {
        System.out.println("Задача 7:");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println(weightDifference);
        weightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println(weightDifference);
    }
    public static void task8() {
        System.out.println("Задача 8:");
        var overallWorkHours = 640;
        var workHoursPerStaffMember = 8;
        var staffMembers = overallWorkHours / workHoursPerStaffMember;
        System.out.println("Всего работников в компании - " + staffMembers + " человек");
        staffMembers = staffMembers + 94;
        overallWorkHours = staffMembers * 8;
        System.out.println("Если в компании работает " + staffMembers + " человек, то всего "
                + overallWorkHours + " часов работы может быть поделено между сотрудниками");
        System.out.println("Работа завершена");
    }
}