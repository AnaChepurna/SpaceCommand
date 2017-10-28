package person;

import java.util.List;
import java.util.TreeMap;

public class Person {
    String firstName;
    String secondName;
    Gender gender;
    List<Feature> features;
    TreeMap<SkillType, Skill> skills;

    Person() {}

    public List<Feature> getFeatures() {
        return features;
    }

    @Override
    public String toString() {
        return firstName + " " + secondName  +
                ", " + gender +
                ", features=" + features;
    }
}
