package person;

import java.util.*;

public class FCombination {
    public static List <Set<FCombination>> combs = new ArrayList<>();

    private List<Feature> originalFeatures;
    private Feature combinationFeature;

    private FCombination(Feature combinationFeature, Feature ... originals) {
        this.combinationFeature = combinationFeature;
        originalFeatures = new ArrayList<>();
        Collections.addAll(originalFeatures, originals);
    }

    public List<Feature> getOriginalFeatures() {
        return originalFeatures;
    }

    public Feature getCombinationFeature() {
        return combinationFeature;
    }

    private static int index;

    static {
        combs.add(new HashSet<>());
        initList3();
        index++;
        combs.add(new HashSet<>());
        initList2();
    }

    private static void addToList(Feature combinationFeature,Feature ... features) {
        combs.get(index).add(new FCombination(combinationFeature, features));
    }

    private static void initList3()
    {
        addToList(CombinationFeature.ANDROID, PlainFeature.COWARDLY, PlainFeature.COWARDLY, PlainFeature.COWARDLY);
        addToList(CombinationFeature.ANDROID, PlainFeature.FEARLESS, PlainFeature.FEARLESS, PlainFeature.FEARLESS);
        addToList(CombinationFeature.ANDROID, PlainFeature.EVIL, PlainFeature.EVIL, PlainFeature.EVIL);
        addToList(CombinationFeature.ANDROID, PlainFeature.CREATIVE, PlainFeature.CREATIVE, PlainFeature.CREATIVE);
        addToList(CombinationFeature.ANDROID, PlainFeature.PRETTY, PlainFeature.PRETTY, PlainFeature.PRETTY);
        addToList(CombinationFeature.ANDROID, PlainFeature.EXTROVERT, PlainFeature.EXTROVERT, PlainFeature.EXTROVERT);
        addToList(CombinationFeature.ANDROID, PlainFeature.UGLY, PlainFeature.UGLY, PlainFeature.UGLY);
        addToList(CombinationFeature.ANDROID, PlainFeature.INTROVERT, PlainFeature.INTROVERT, PlainFeature.INTROVERT);
        addToList(CombinationFeature.ANDROID, PlainFeature.ACTIVE, PlainFeature.ACTIVE, PlainFeature.ACTIVE);
        addToList(CombinationFeature.ANDROID, PlainFeature.KIND, PlainFeature.KIND, PlainFeature.KIND);
        addToList(CombinationFeature.ANDROID, PlainFeature.LAZY, PlainFeature.LAZY, PlainFeature.LAZY);
        addToList(CombinationFeature.ANDROID, PlainFeature.LOGIC, PlainFeature.LOGIC, PlainFeature.LOGIC);
        addToList(CombinationFeature.ANDROID, PlainFeature.EMOTIONAL, PlainFeature.EMOTIONAL, PlainFeature.EMOTIONAL);
        addToList(CombinationFeature.MANIAC, PlainFeature.CREATIVE, PlainFeature.CREATIVE, PlainFeature.EVIL);
        addToList(CombinationFeature.CHOOSEN_ONE, PlainFeature.PRETTY, PlainFeature.FEARLESS, PlainFeature.KIND);
    }

    private static void initList2() {
        addToList(CombinationFeature.ACTOR, PlainFeature.UGLY, PlainFeature.PRETTY);
        addToList(CombinationFeature.STRONG, PlainFeature.ACTIVE, PlainFeature.LAZY);
        addToList(CombinationFeature.LEADER, PlainFeature.EXTROVERT, PlainFeature.EXTROVERT);
        addToList(CombinationFeature.LONER, PlainFeature.INTROVERT, PlainFeature.INTROVERT);
        addToList(CombinationFeature.AMEBA, PlainFeature.LAZY, PlainFeature.LAZY);
        addToList(CombinationFeature.CANDID, PlainFeature.KIND, PlainFeature.EVIL);
        addToList(CombinationFeature.JOKER, PlainFeature.ACTIVE, PlainFeature.ACTIVE);
        addToList(CombinationFeature.VILLIAN, PlainFeature.EVIL, PlainFeature.EVIL);
        addToList(CombinationFeature.NUTTY_SCIENTIST, PlainFeature.CREATIVE, PlainFeature.CREATIVE);
        addToList(CombinationFeature.IDEAL_BEAUTY, PlainFeature.PRETTY, PlainFeature.PRETTY);
        addToList(CombinationFeature.MONSTER, PlainFeature.UGLY, PlainFeature.UGLY);
        addToList(CombinationFeature.CREW_PARENT, PlainFeature.EXTROVERT, PlainFeature.KIND);
        addToList(CombinationFeature.EVIL_GENIOUS, PlainFeature.EVIL, PlainFeature.CREATIVE);
        addToList(CombinationFeature.MYSTERY_BEAUTY, PlainFeature.PRETTY, PlainFeature.INTROVERT);
        addToList(CombinationFeature.SIMPLE_GUY, PlainFeature.EXTROVERT, PlainFeature.LAZY);
        addToList(CombinationFeature.NERDY, PlainFeature.CREATIVE, PlainFeature.INTROVERT);
        addToList(CombinationFeature.STUPID_MINION, PlainFeature.LAZY, PlainFeature.UGLY);
        addToList(CombinationFeature.WORK_FAN, PlainFeature.ACTIVE, PlainFeature.INTROVERT);
        addToList(CombinationFeature.EFFECTIVE_MANAGER, PlainFeature.ACTIVE, PlainFeature.EXTROVERT);
        addToList(CombinationFeature.SCHEMER, PlainFeature.EVIL, PlainFeature.EXTROVERT);
        addToList(CombinationFeature.CHARMING_PERSON, PlainFeature.KIND, PlainFeature.PRETTY);
        addToList(CombinationFeature.WISE_ADVISOR, PlainFeature.INTROVERT, PlainFeature.EXTROVERT);
        addToList(CombinationFeature.HYPERCOMPENSATION, PlainFeature.UGLY, PlainFeature.ACTIVE);
        addToList(CombinationFeature.FATAL_ONE, PlainFeature.PRETTY, PlainFeature.EVIL);
        addToList(CombinationFeature.PERFECTIONIST, PlainFeature.COWARDLY, PlainFeature.COWARDLY);
        addToList(CombinationFeature.IRRESPONSIBLE, PlainFeature.FEARLESS, PlainFeature.FEARLESS);
        addToList(CombinationFeature.SLY, PlainFeature.FEARLESS, PlainFeature.COWARDLY);
        addToList(CombinationFeature.BEST_LOVER, PlainFeature.ACTIVE, PlainFeature.PRETTY);
        addToList(CombinationFeature.SHY, PlainFeature.INTROVERT, PlainFeature.COWARDLY);
        addToList(CombinationFeature.SUPER_SMART, PlainFeature.LOGIC, PlainFeature.LOGIC);
        addToList(CombinationFeature.IRRATIONAL, PlainFeature.EMOTIONAL, PlainFeature.EMOTIONAL);
        addToList(CombinationFeature.TELEPAT, PlainFeature.EMOTIONAL, PlainFeature.LOGIC);
        addToList(CombinationFeature.CONTRIVER, PlainFeature.LOGIC, PlainFeature.LAZY);
        addToList(CombinationFeature.HERO, PlainFeature.ACTIVE, PlainFeature.FEARLESS);
        addToList(CombinationFeature.ROMANTIC, PlainFeature.EMOTIONAL, PlainFeature.INTROVERT);
        addToList(CombinationFeature.ARTIST, PlainFeature.CREATIVE, PlainFeature.EMOTIONAL);
    }
}