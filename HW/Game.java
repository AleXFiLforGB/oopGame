package HW;

import HW.Units.Mage;
import HW.Units.Monk;
import HW.Units.Peasant;
import HW.Units.Spearman;
import HW.Units.Thief;
import HW.Units.Names;
import HW.Units.Crossbowman;
import HW.Units.Sniper;
import HW.Units.Unit;

import java.util.ArrayList;
import java.util.Random;

/**
 * ДЗ №1
 * + Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
 * + Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
 * + Создать абстрактный класс и иерархию наследников.
 * + Расположить классы в пакет так, чтобы в основной программе небыло видно их полей.
 * + В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя.
 * + Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.
 */

/**
 * ДЗ №2
 * + Добавить файл с описанием интерфейса.
 * + В котором описать два метода, void step(); и String getInfo();
 * + Реализовать интерфейсы в абстрактном классе и в наследниках так, чтобы getInfo возвращал информацию о персонаже.
 * + Создать два списка в классе main.
 * + В каждый список добавить по десять экземнляров наследников BaseHero.
 * + В main пройти по спискам и вызвать у всех персонажей getInfo.
 */
public class Game {
    public static void main(String[] args) {

        ArrayList<Unit> teamRed = new ArrayList<>();
        ArrayList<Unit> teamBlue = new ArrayList<>();

        int numOfUnits = 5;

        addUnits(teamBlue,numOfUnits);
        addUnits(teamRed,numOfUnits);

        teamRed.forEach(n -> n.step());


        System.out.println("Команда Красных:");
        teamRed.forEach(n -> System.out.println(n.getInfo()));

//        teamRed.forEach(n -> System.out.println(n.getInfo()));
        System.out.println(teamRed);
        teamRed.sort(Unit::compareTo);
        System.out.println(teamRed);

        //вывод команд


//        System.out.println("Команда Красных: ");
//        System.out.println(teamRed);
//
//        System.out.println("Команда Синих: ");
//        System.out.println(teamBlue);

        // Вывод всех пар-ров команд
//        System.out.println("Команда Синих: ");
//        printUnits(teamBlue);

    }

    public static String getNames() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

//    Метод заполнения команды используеются
    public static void addUnits (ArrayList<Unit> team, int numOfUnits) {

        Random r = new Random();
        for (int i = 0; i < numOfUnits; i++) {
            int val = r.nextInt(7);
            switch (val) {
                case 0:
                    team.add(new Monk(team, getNames()));
                    break;
                case 1:
                    team.add(new Sniper(team, getNames()));
                    break;
                case 2:
                    team.add(new Crossbowman(team, getNames()));
                    break;
                case 3:
                    team.add(new Mage(team, getNames()));
                    break;
                case 5:
                    team.add(new Thief(team, getNames()));
                    break;
                case 6:
                    team.add(new Spearman(team, getNames()));
                    break;
                default:
                    team.add(new Peasant(team, getNames()));
                    break;
            }
        }
    }

    public static void printUnits (ArrayList<Unit> team) {
        for (Unit unit: team) {
            System.out.println(unit.toString() + unit.getInfo());
        }
    }
}
