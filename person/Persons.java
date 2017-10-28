package person;

import utils.RandomHelper;

import java.util.*;

public abstract class Persons {

    private static String [] maleNames = new String[] {"John", "James", "Oliver", "Kevin",
            "Rick", "George", "Abraham", "Graham", "Sam", "Poul", "Iwan",
            "Pablo", "Basyl", "Artur", "Terry", "Tommy", "Luk", "Alex",
            "Fred", "Steven", "Gregory", "Vincent", "Marco", "Jacob",
            "Matthew", "Ethan", "Ryan", "David", "Walter", "Nathan", "Logan",
            "Tyler", "Caleb", "Jack", "Isaac", "Luis", "Seth", "Carter",
            "Sebastian", "Patrick", "Jesse", "Wyatt", "Mason", "Gabrial",
            "Dmitry", "Thomas", "Adam", "Mykola", "Theodor", "Leon", "Peter",
            "Tristan", "Romeo", "Nathaniel", "Harry", "Swan", "Sigfrid",
            "Oscar", "William", "Liam", "Hugo", "Alexander", "Adrian", "Alfred",
            "Filip", "Charlie", "Elliot", "Nils", "Edvin", "Viktor", "Gustav",
            "Emil", "Viggo", "Olle", "Erik", "Frank", "Max", "Carl", "Matteo",
            "Otto", "Kian", "Nikolas", "Aaron", "Simon", "Samuel", "Thor",
            "Omar", "Rasmus", "Mio", "Edvard", "Ali", "Lars", "Anders", "Hans",
            "Jan", "Lennart", "Gunnar", "Martin", "Henrik", "Kjell", "Emil",
            "Stig", "Roland", "Ingvar", "Tobias", "Kenneth", "Kurt", "Donnie",
            "Dennis", "Alain", "Daniel", "Bernard", "Pascal", "Enzo", "Cristophe"};

    private static String [] femaleNames = new String[] {"Olivia", "Cat", "Lily", "Emily", "Vanessa",
            "Ella", "Hanna", "Roxana", "Mary", "Faith", "Jenna", "Rose",
            "Riley", "Kim", "Sara", "Rebecca", "Avery", "Maya", "Katelyn",
            "Melanie", "Diana", "Erin", "Melissa","Caroline", "Zoe", "Kylie",
            "Megan", "Victoria", "Chloe", "Batty", "Isabella", "Isolda",
            "Juliette", "Samantha", "Abigail", "Emma","Grace", "Liza",
            "Alyssa", "Jasmine", "Mia", "Leah", "Amber", "Jane", "Maryna",
            "Lidia", "Julia", "Amanda", "Paula", "Harvy", "Gary", "Ada",
            "Susy", "Fiona", "Elsa", "Ariel", "Brunhilda", "Nancy", "Eva",
            "Ebba", "Wilma", "Molly", "Alva", "Astrid", "Signe", "Freja",
            "Stella", "Linnea", "Vera", "Clara", "Ester", "Ines", "Sigrid",
            "Lovisa", "Thea", "Tilde", "Luna", "Sally", "Cleo", "Penny", "Greta",
            "Bianca", "Nathalie", "Birgitta", "Sofia", "Kerstin", "Cecilia",
            "Monica", "Louise", "Linda", "Annika", "Camilla", "Ellinor",
            "Agnes", "Ann Cristin", "Gunnel", "Mona", "Rut", "Charlotte", "Sandra",
            "Bonnie", "Nicole", "Celine", "Patricia", "Beatrice", "Chiyo",
            "Nina"};

    private static String [] secondNames = new String[] {"Finch", "Jones", "Bond", "Connery",
            "Blaine", "Starling", "Foster", "Ripley", "Steward", "Solo", "Brando", "Cooper",
            "Gagarin", "Doyle", "Powers", "Lecter", "Bates", "Vader", "Potter", "Corleone",
            "Wilkes", "Harrington", "Jarett", "Cady", "Krueger", "Joker", "Harris",
            "Stark", "Ritchie", "Kernighan", "West", "Hekko", "Goldfinger", "Norton",
            "Phoenix", "White", "Frost", "Rork", "Riddle", "Rider", "Zorg", "Rheon",
            "Archer", "Chekov", "Kirk", "Uhura", "O'Brien", "Habsburger", "Savoia",
            "Lowliet", "Pretty", "Shepard", "Glenn", "Borman", "Armstrong",
            "Kohen", "Melwill", "Dias", "Lennon", "Wander", "Berry", "Brown",
            "Floyd", "Pink", "Fortran", "Lila", "Dimaggio", "Sugar", "Borgia",
            "Irons", "Lebowski", "Lovelace", "Wirth", "Gates", "Gosling", "Thompson",
            "Knuth", "Torvalds", "Newton", "Curie", "Tesla", "Maxwell", "Aquinas",
            "Descartes", "Sartre", "Russel", "Hobbs", "Heidegger", "Antonovka",
            "Tolkien", "Orwell", "Wilde", "Fitzgerald", "Alighieri", "Joyce",
            "Lewis", "Carrol", "Goethe", "Grimm", "Andersen", "King", "Shelley",
            "Woolf", "Huxley", "Swift", "Bradbury", "Kipling", "Bronte", "Proust",
            "Seuss", "Gogol", "Stoker", "Lovecraft", "Ibsen", "Byron", "Lindgren"};

    private static String getFemaleName() {
        return femaleNames[RandomHelper.nextInt(femaleNames.length)];
    }

    private static String getMaleName() {
        return maleNames[RandomHelper.nextInt(maleNames.length)];
    }

    private static String getSecondName() {
        return secondNames[RandomHelper.nextInt(secondNames.length)];
    }

    private static Gender getGender() {
        return Gender.values()[RandomHelper.nextInt(2)];
    }

    private static Feature getPlainFeature() {
        return PlainFeature.values()[RandomHelper.nextInt(PlainFeature.values().length)];
    }

    private static Feature pickCombination(List<Feature> features) {
        for (Set<FCombination> set: FCombination.combs) {
            for (FCombination comb : set) {
                List<Feature> buff = new ArrayList<>();
                for (Feature combFeature : comb.getOriginalFeatures()) {
                    for (int i = 0; i < features.size(); i++) {
                        if (features.get(i) == combFeature) {
                            buff.add(combFeature);
                            features.remove(i);
                        }
                    }
                }
                if (buff.size() == comb.getOriginalFeatures().size()) {
                    features.add(comb.getCombinationFeature());
                    return comb.getCombinationFeature();
                }
                if (buff.size() > 0)
                    Collections.addAll(features, buff.toArray(new Feature[buff.size()]));
            }
        }
        return null;
    }

    private static void checkPerson(Person person) {
        if (person.features.get(0) == CombinationFeature.ANDROID)
            person.secondName = "" + RandomHelper.nextInt(1000);
    }

    public static Person getPerson() {
        Person person = new Person();
        person.gender = getGender();
        if (person.gender == Gender.MALE)
            person.firstName = getMaleName();
        else
            person.firstName = getFemaleName();
        person.secondName = getSecondName();
        person.features = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            person.features.add(getPlainFeature());
        }
        pickCombination(person.features);
        checkPerson(person);
        return person;
    }
}
