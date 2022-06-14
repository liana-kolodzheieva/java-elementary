package com.hillel.homework.homework14;
import java.time.LocalDate;
import java.time.Month;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
public class MapPeople {
    public static void main(String[] args) {
        Map<String, LocalDate> map = new HashMap<>();
        map.put("K", LocalDate.of(2008, 8,6));
        map.put("L", LocalDate.of(2000, 3,5));
        map.put("S ", LocalDate.of(1988, 5,7));
        map.put("F ", LocalDate.of(2008, 6,7));
        map.put("G", LocalDate.of(2008, 3,1));
        map.put("H", LocalDate.of(2008, 7,30));
        map.put("C", LocalDate.of(2008, 1,5));
        map.put("U", LocalDate.of(2008, 6,30));
        map.put("I", LocalDate.of(2008, 12,27));
        map.put("Y", LocalDate.of(2008, 10,10));
        System.out.println(map);
        removePeople(map);
        System.out.println("after");
        System.out.println(map);
    }
    public static void removePeople(Map<String, LocalDate>map){

        Iterator<LocalDate> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            LocalDate value = iterator.next();
            if (value.getMonth().equals(Month.JUNE)
                    || value.getMonth().equals(Month.JULY)
                    || value.getMonth().equals(Month.AUGUST)){
                iterator.remove();
            }
        }

    }

}
