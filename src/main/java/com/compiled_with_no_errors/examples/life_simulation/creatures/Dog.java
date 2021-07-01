package com.compiled_with_no_errors.examples.life_simulation.creatures;

class Dog extends AbstractCreature {
    private static int INDEX; // Keeps track of index

    // Settings for DOG class
    static final CreatureSettings DOG_SETTINGS = new CreatureSettings(2, 2500, 300, 800, 450);
    static final float DOG_SETTINGS_VARIANCE = 0.15F; // Percentage of variance per setting

    private final Gender gender;

    /**
     *
     * @param latitude Latitude of the dog
     * @param longitude logitude of the dog
     * @param settings DNA
     * @param gender Gender
     */
    public Dog(int latitude, int longitude, CreatureSettings settings, Gender gender) {
        super("Dog-" + INDEX++, latitude, longitude, settings);
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    /**
     * Gave birth to a new creature
     */
    @Override
    protected Dog birth() {
        if (gender == Gender.female){
            return null;
            // TODO check for each candidate settings to create a new dog.
        }
        return null;
    }
}
