package HW;

import HW.Units.Magican.Mage;
import HW.Units.Magican.Monk;
import HW.Units.Melee.Peasant;
import HW.Units.Melee.Spearman;
import HW.Units.Melee.Thief;
import HW.Units.Names;
import HW.Units.Range.Crossbowman;
import HW.Units.Range.Sniper;
import HW.Units.Unit;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedMap;

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
 * + Добавить файл с описанием интерфейса.
 * + В котором описать два метода, void step(); и String getInfo();
 * + Реализовать интерфейсы в абстрактном классе и в наследниках так, чтобы getInfo возвращал информацию о персонаже.
 * + Создать два списка в классе main.
 * + В каждый список добавить по десять экземнляров наследников BaseHero.
 * + В main пройти по спискам и вызвать у всех персонажей getInfo.
 */
public class Game {
    public static void main(String[] args) {
        ArrayList<Unit> units = new ArrayList<>();
        units.add(new Peasant("Сэм"));
        units.add(new Thief("Bob"));
        units.add(new Mage ("Володя"));
        units.add(new Sniper("Торвальд"));
        units.add(new Spearman("Ахилес"));
        units.add(new Crossbowman("Брейдон"));
        units.add(new Monk("Tomas"));

//        for (Unit unit: units) {
//            System.out.println(unit.toString());
//            System.out.println(unit.getInfo());
//        }

        ArrayList<Unit> teamRed = new ArrayList<>();
        ArrayList<Unit> teamBlue = new ArrayList<>();

        int numOfUnits = 10;

        addUnits(teamBlue,numOfUnits);
        addUnits(teamRed,numOfUnits);

        System.out.println("Команда Синих: ");
        printUnits(teamBlue);

        System.out.println("Команда Красных:");
        teamRed.forEach(n -> System.out.println(n.getInfo()));

        System.out.println(Names.values()[new Random().nextInt(Names.values().length)]);
    }

    public static String getNames() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

    public static void addUnits (ArrayList<Unit> team, int numOfUnits) {

        Random r = new Random();
        for (int i = 0; i < numOfUnits; i++) {
            int val = r.nextInt(7);
            switch (val) {
                case 0:
                    team.add(new Monk(getNames()));
                    break;
                case 1:
                    team.add(new Sniper(getNames()));
                    break;
                case 2:
                    team.add(new Crossbowman(getNames()));
                    break;
                case 3:
                    team.add(new Mage(getNames()));
                    break;
                case 5:
                    team.add(new Thief(getNames()));
                    break;
                case 6:
                    team.add(new Spearman(getNames()));
                    break;
                default:
                    team.add(new Peasant(getNames()));
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
