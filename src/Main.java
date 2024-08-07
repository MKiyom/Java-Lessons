import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("-= HashMap =-");

        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Kiyom");
        map.put(1, "Iso");
        map.put(2, "Muhammad");

        System.out.println(map); // shows all
        System.out.println(map.get(1)); // shows only the one you chose
        System.out.println(map.remove(2)); // 1 removed
        System.out.println(map.containsKey(0)); // true
        System.out.println(map.containsValue("John")); //false
        System.out.println(map.size()); // shows how many are there

//================================================================================//

        System.out.println("-= HashSet =-");

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        System.out.println(hashSet);

//================================================================================//

        System.out.println("Date: " + LocalDate.now()); //shows the real date
        System.out.println("Time: " + LocalTime.now()); // shows the real time
        System.out.println("Date and Time: " + LocalDateTime.now()); // shows both date and time

        LocalDate now = LocalDate.now();
        System.out.println(now.plusDays(5)); // you can do minus as well

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        ZoneId zone = ZoneId.of("Asia/Dushanbe");
        ZonedDateTime tajTime = ZonedDateTime.of(localDate, localTime, zone);
        System.out.println(tajTime);

        List<String> zones = new ArrayList<>(ZoneId.getAvailableZoneIds()); // all the global time zones
        zones.forEach(System.out::println);

    }
}
