import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1 задача
        System.out.println("В каком году ты родился?");
        Scanner year = new Scanner(System.in);
        int age = year.nextInt();
        int yourAge = 2024 - ++age;
        short monthNow = 4;
        System.out.println("А в каком месяце?");
        Scanner month = new Scanner(System.in);
        int monthOfBirthday = month.nextInt();
        if (monthOfBirthday <= monthNow ) { yourAge++;
        }
        if (yourAge >= 18){System.out.println("Поздравляю, ты совершеннолетний.");} else{
            System.out.println("Извини, придется подождать еще вот столько лет - " + (18 - yourAge));}
        //2 задача
        System.out.println("  ");
        System.out.println("Сколько сейчас градусов на улице?");
        Scanner t = new Scanner(System.in);
        int weather = t.nextInt();
        if ( weather >= 5 && yourAge >= 18 ) {System.out.println("Все в порядке, шапка не нужна, там тепло а ты уже взрослый.");}
        else if ( weather >= 5 && yourAge < 18 ) {System.out.println("Там, конечно тепло, но ты еще мелкий, без шапки ходить!");}
        else {System.out.println("Там холодно. Надень, пожалуйста, шапку.");}
        //3 задача
        System.out.println(" ");
        System.out.println("Что там на спидометре?");
        Scanner speed = new Scanner(System.in);
        int speedNow = speed.nextInt();
        if (speedNow <= 60 && yourAge >= 18) {System.out.println("Так держать, не гоняй и все будет отлично");
        }
        else if (yourAge < 18 ) {System.out.println("Эй! Тебе вообще за руль нельзя!! Немедленно припаркуйся, надень шапку и выйди из машины.");
        }
        else System.out.println("Не, бро, так не пойдет, с тебя штраф.");
        //4 задача
        System.out.println(" ");
        System.out.println("Сколько тебе лет?");
        Scanner age2 = new Scanner(System.in);
        int age4 = age2.nextInt();
        if (age4 >=2 && age4 <= 6) {System.out.println("Должно быть, ты ходишь в детский садик?");
        }
        else if (age4 > 6 && age4 <= 17 ) {System.out.println("Твое место в школе");
        }
        else if (age4 >= 18 && age4 <= 24) {System.out.println("В этом возрасте многие учатся в универе");
        }
        else if ( age4 > 24) {System.out.println("У меня для тебя плохие новости. Тебе пора ходить на работу.");
        }
        //5 задачча
        System.out.println(" ");
        System.out.println("Сколько лет ребенку? ");
        Scanner baby = new Scanner(System.in);
        int babyAge = baby.nextInt();
        if (babyAge < 5) {
            System.out.println("Извините,ребенок не может кататься на аттаракционах");
        }
        else if (babyAge > 5 && babyAge < 14) {
            System.out.println("Ребенку можно кататься на аттракционах в сопровождении взрослого.");
        }
        else if (babyAge > 14){
            System.out.println("Ребенку можно кататься на аттракционах без сопровождения взрослого");
        }
        //6 задача
        System.out.println(" ");
        int wagon = 102;
        int seat = 60;
        int seatFree;
        int places;
        System.out.println("Сколько человек уже в вагоне?");
        Scanner people = new Scanner(System.in);
        int peopleInWagon = people.nextInt();
        seatFree = seat - peopleInWagon;
        places = wagon - peopleInWagon;
        if (peopleInWagon < seat) {
            System.out.println("В вагоне осталось " + seatFree + " свободных сидений и 42 стоячих места.");
        }
        else if (peopleInWagon > seat && peopleInWagon < wagon ){
            System.out.println("В вагоне осталось " + places + " стоячих мест.");
        }
        else if ( peopleInWagon > wagon ) {
            System.out.println("Мест нет.");
        }
        //7 задача
        int one;
        int two;
        int three;
        int max = 0;
        int ave = 0;
        int min = 0;
        Scanner g = new Scanner(System.in);
        System.out.println("Пожалуйста, введите три числа. ");
        one =  g.nextInt();
        two = g.nextInt();
        three = g.nextInt();
        if ( one > two && one > three ){
            max = one;
        } else if ( two > one && two > three) {
            max = two;
        } else {
            max = three;
        }
        if ( one < two && one < three ){
            min = one;
        } else if ( two < one && two < three) {
            min = two;
        } else {
            min = three;
        }
        if ( min != one && max != one){
            ave = one;
        } else if ( min != two && max != two) {
            ave = two;
        } else {
            ave = three;
        }

        System.out.println("Max = " + max + " Average = " + ave + " Min = " + min);
    }
}

