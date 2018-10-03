//Question 7 Design a Data Structure SpecialStack that supports
// all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Athlete implements Comparable<Athlete> {

    String name;
    String sport;
    String country;
    int worldRank;


    public Athlete(String name, String sport, String country, int worldRank) {
        this.name = name;
        this.sport = sport;
        this.country = country;
        this.worldRank = worldRank;
    }

    public int compareTo(Athlete athlete) {
        return this.worldRank - worldRank;

    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", sport='" + sport + '\'' +
                ", country='" + country + '\'' +
                ", worldRank=" + worldRank +
                '}';
    }

    public static void main(String[] args) {

        List athlete = new ArrayList();

        Athlete a1 = new Athlete("Talib", "Cricket", "India", 1);
        Athlete a2 = new Athlete("Anuj", "TT", "India", 2);
        athlete.add(a1);
        athlete.add(a2);
        List<String> medals = new ArrayList<String>();
        medals.add("National");
        medals.add("State Level");

        Collections.sort(athlete);
        String result = athlete.toString();
        System.out.println(athlete);

    }


}