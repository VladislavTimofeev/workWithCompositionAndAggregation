//package com.company.task3;
//
//import com.company.util.Util;
//
//import java.util.Arrays;
//
///**
// * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
// * столицу, количество областей, площадь, областные центры.
// *
// * Вывести столицу : пройтись по всем регионам, пройтись по всем районам, в районе пройтись по всем городам и есть citi.isCapital то вернуть этот город так как это столица.
// * Количество областей : создать метод getRigionsCount и вернуть .lenght
// * Площадь : state.getSquare
// * Областные центры : пройтись по всем регионам, в каждом регионе получить все районы и каждый район вывести на экран.
// *
// * добавить toString и getters
// */
//
//public class Task3 {
//
//    public static void main(String[] args) {
//
//        Region region1 = new Region("BrestDistrict", 1, 32777, 1338044, "Brest");
//        Region region2 = new Region("VitebskDistrick", 2, 40051, 1120364, "Vitebsk");
//        Region region3 = new Region("GomelDistrick", 3, 40372, 1375286, "Gomel");
//        Region region4 = new Region("GrodnoDistrick", 4, 25127, 1026816, "Grodno");
//        Region region5 = new Region("MogilevDistrick", 5, 29068, 1024751, "Mogivel");
//        Region region6 = new Region("MinskDistrick", 6, 39854, 1471240, "Minsk");
//
//        Region[] regions = new Region[]{region1, region2, region3, region4, region5, region6};
//
//        State state = new State("Belarus", "Minsk", 348, 2018281, regions);
//
//        Util.print(state.getCapital());
//        Util.print("-----------------------------------------");
//        for (Region region : state)
//        Util.print(Arrays.toString(regions));
//        Util.print("-----------------------------------------");
//        Util.print();
//    }
//}
