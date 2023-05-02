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

/**
 * ДЗ №4
 * Создать класс хронящий координаты x и y.
 * С конструктором и методом принимающим координату а возвращающим расстояние от своей координаты до переданной.
 * Переопределить метод step в стрелках таким образом, чтобы при наличии стрел и жизней стрелки находили ближайшего противника и наносили ему повреждение.
 * В своей комманде найти крестьян и, если крестьянин жив и не занят, занять его доставкой стрел. Иначе стрелы уходят по одной на выстрел.
 */
public class Game {
    public static void main(String[] args) {

        ArrayList<Unit> teamRed = new ArrayList<>();
        ArrayList<Unit> teamBlue = new ArrayList<>();

        int numOfUnits = 10;

        addUnitsForTeamBlue(teamBlue,numOfUnits);
        addUnits(teamRed,numOfUnits);

        System.out.println(teamRed);
        System.out.println(teamBlue);
        teamRed.forEach(n -> n.step(teamBlue));
        teamBlue.forEach(n -> n.step(teamRed));


    }





    public static String getNames() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

//    Метод заполнения команды используеются
    public static void addUnits (ArrayList<Unit> team, int numOfUnits) {

        Random r = new Random();
        for (int i = 1; i < numOfUnits + 1; i++) {
            int val = r.nextInt(7);
            switch (val) {
                case 0:
                    team.add(new Monk(team, getNames(), 1, i));
                    break;
                case 1:
                    team.add(new Sniper(team, getNames(),1, i));
                    break;
                case 2:
                    team.add(new Crossbowman(team, getNames(),1, i));
                    break;
                case 3:
                    team.add(new Mage(team, getNames(),1, i));
                    break;
                case 5:
                    team.add(new Thief(team, getNames(),1, i));
                    break;
                case 6:
                    team.add(new Spearman(team, getNames(),1, i));
                    break;
                default:
                    team.add(new Peasant(team, getNames(),1, i));
                    break;
            }
        }
    }

    public static void addUnitsForTeamBlue (ArrayList<Unit> team, int numOfUnits) {

        Random r = new Random();
        for (int i = 1; i < numOfUnits + 1; i++) {
            int val = r.nextInt(7);
            switch (val) {
                case 0:
                    team.add(new Monk(team, getNames(), 10, i));
                    break;
                case 1:
                    team.add(new Sniper(team, getNames(),10, i));
                    break;
                case 2:
                    team.add(new Crossbowman(team, getNames(),10, i));
                    break;
                case 3:
                    team.add(new Mage(team, getNames(),10, i));
                    break;
                case 5:
                    team.add(new Thief(team, getNames(),10, i));
                    break;
                case 6:
                    team.add(new Spearman(team, getNames(),10, i));
                    break;
                default:
                    team.add(new Peasant(team, getNames(),10, i));
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
