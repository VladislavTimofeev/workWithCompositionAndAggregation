package com.company.task3;

import com.company.util.Util;

/**
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 * <p>
 * Вывести столицу : пройтись по всем регионам, пройтись по всем районам, в районе пройтись по всем городам и есть citi.isCapital то вернуть этот город так как это столица.
 * Количество областей : создать метод getRigionsCount и вернуть .lenght
 * Площадь : state.getSquare
 * Областные центры : пройтись по всем регионам, в каждом регионе получить все районы и каждый район вывести на экран.
 * <p>
 * добавить toString и getters
 */

public class Task3 {

    public static void main(String[] args) {

        City city1 = new City("Brest", false);
        City city2 = new City("Vitebsk", false);
        City city3 = new City("Gomel", false);
        City city4 = new City("Grodno", false);
        City city5 = new City("Mogivel", false);
        City city6 = new City("Minsk", true);

        City[] cities = new City[]{city1, city2, city3, city4, city5, city6};

        Util.print("----------------------------------------------------------------");

        District district1 = new District(cities, "Brestsky");
        District district2 = new District(cities, "Vitebsky");
        District district3 = new District(cities, "Gomelsky");
        District district4 = new District(cities, "Grodnensky");
        District district5 = new District(cities, "Mogilevsky");
        District district6 = new District(cities, "Minsky");

        District[] districts = new District[]{district1, district2, district3, district4, district5, district6};


        Region region1 = new Region(districts, "Brest", "Brest");
        Region region2 = new Region(districts, "Vitebsk", "Vitebsk");
        Region region3 = new Region(districts, "Gomel", "Gomel");
        Region region4 = new Region(districts, "Grondo", "Grodno");
        Region region5 = new Region(districts, "Mogilev", "Mogivel");
        Region region6 = new Region(districts, "Minsk", "Minsk");

        Region[] regions = new Region[]{region1, region2, region3, region4, region5, region6};

        State state = new State("Belarus", 300000, regions);

        Util.print(String.valueOf(state.getSquare()));

        City capital = state.getCapital();
        Util.print(capital.getName());

        Region[] regionsCenters = state.getRegionCentr();
        for (Region region : regionsCenters) {
            Util.print(region.getName());
        }
    }


}

