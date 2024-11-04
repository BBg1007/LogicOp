public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задача №1:");
        System.out.println();
        byte currAge1 = 17;
        if (currAge1 >= 18){
            System.out.println("Если возраст человека равен "+currAge1+", то он совершеннолетний." );
        }
        else {
            System.out.println("Если возраст человека равен "+currAge1+", то он не достиг совершеннолетия, нужно немного подождать." );
        }
        System.out.println();
        //Task 2
        System.out.println("Задача №2");
        System.out.println();
        byte currTemp = 3;
        if (currTemp < 5) {
            System.out.println("На улице "+currTemp+" градусов, нужно надеть шапку.");
        }
        else {
            System.out.println("На улице "+currTemp+" градусов, можно идти без шапки.");
        }
        System.out.println();
        //Task 3
        System.out.println("Задача №3");
        System.out.println();
        short currSpeed = 63;
        if (currSpeed <= 60){
            System.out.println("Если сокрость "+currSpeed+", то можно ездить спокойно.");
        }
        else {
            System.out.println("Если сокрость "+currSpeed+", то придется заплатить штраф.");
        }
        System.out.println();
        //Task 4
        System.out.println("Задача №4");
        System.out.println();
        byte currAge2 = 19;
        if (currAge2 >=2 && currAge2 <=6){
            System.out.println("Если возраст человека равен "+currAge2+", то ему нужно ходить в детский сад.");
        }
        else if (currAge2 >=7 && currAge2 <=17) {
            System.out.println("Если возраст человека равен "+currAge2+", то ему нужно ходить в школу.");
        }
        else if (currAge2 >=18 && currAge2 <=24) {
            System.out.println("Если возраст человека равен "+currAge2+", то ему нужно ходить в университет.");
        }
        else if (currAge2 >24) {
            System.out.println("Если возраст человека равен "+currAge2+", то ему нужно ходить на работу.");
        }
        System.out.println();
        //Task 5
        System.out.println("Задача №5");
        System.out.println();
        byte currAge3 = 4;
        if (currAge3<5){
            System.out.println("Если возраст ребенка равен "+currAge3+", то ему нельзя кататься на аттракционе.");
        } else if (currAge3>=5 && currAge3 <14) {
            System.out.println("Если возраст ребенка равен "+currAge3+", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        else if (currAge3>=14){
            System.out.println("Если возраст ребенка равен "+currAge3+", то ему можно кататься на аттракционе.");
        }
        System.out.println();
        //Task 6
        System.out.println("Задача №6");
        System.out.println();
        byte capTotal = 102;
        byte seatTotal = 60;
        byte currPpl = 103;
        if (currPpl>capTotal){
            System.out.println("К сожалению - свободных мест в вагоне нет.");
        }
        else if (currPpl>seatTotal) {
            System.out.println("В вагоне сейчас "+(capTotal-currPpl)+ " стоячих мест.");
        }
        else {
            System.out.println("В вагоне сейчас "+(seatTotal-currPpl)+ " сидячих мест.");
        }
        System.out.println();
        //Task 7
        System.out.println("Задача №7");
        System.out.println();
        int one = 1300;
        int two = 1200;
        int three = 570;
        if (one>two && one>three) {
            System.out.println("Наибольшее число - "+one);
        } else if (two>three) {
            System.out.println("Наибольшее число - "+two);
        }
        else {
            System.out.println("Наибольшее число - "+three);
        }
        System.out.println();

        //Task 7.1
        System.out.println("Задача №7 (var. 2)");
        System.out.println();
        int one1 = 1300;
        int two1 = 1400;
        int three1 = 1800;
        if (one1<two1 || one1<three1){
            if (two1<three1){
                System.out.println("Наибольшее число - "+three1);
            }
            else {
                System.out.println("Наибольшее число - "+two1);
            }
        }
        else {
            System.out.println("Наибольшее число - "+one1);
        }
    }
    }