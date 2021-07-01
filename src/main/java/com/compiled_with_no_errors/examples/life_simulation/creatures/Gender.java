package com.compiled_with_no_errors.examples.life_simulation.creatures;


import com.compiled_with_no_errors.examples.life_simulation.utils.MathSupport;

enum Gender {
    male,
    female;


    /**
     *
     * @return A random gender
     */
    static Gender generateRandomGender(){
        Gender[] genders = Gender.values();
        return genders[MathSupport.generateRandomNumber(genders.length - 1)];
    }
}
