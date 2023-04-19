package HW;

import HW.Units.Magican.Mage;
import HW.Units.Magican.Monk;
import HW.Units.Melee.Peasant;
import HW.Units.Melee.Spearman;
import HW.Units.Melee.Thief;
import HW.Units.Range.Crossbowman;
import HW.Units.Range.Sniper;
import HW.Units.Unit;

import java.util.ArrayList;

/**
 * + Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
 * + Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
 * + Создать абстрактный класс и иерархию наследников.
 * + Расположить классы в пакет так, чтобы в основной программе небыло видно их полей.
 * + В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя.
 * + Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.
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

        for (Unit unit: units) {
            System.out.println(unit);
        }
       
    }
}
