package person;

public class Skill {
    private SkillType skillType;
    private int level;

    public Skill(SkillType skillType) {
        this.skillType = skillType;
    }

    public Skill(SkillType skillType, int level) {
        this.skillType = skillType;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void plusLevel(int delta) {
        level +=delta;
    }

    public SkillType getSkillType() {
        return skillType;
    }
}
