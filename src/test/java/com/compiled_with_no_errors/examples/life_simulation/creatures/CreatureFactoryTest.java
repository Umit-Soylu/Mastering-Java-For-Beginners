package com.compiled_with_no_errors.examples.life_simulation.creatures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CreatureFactoryTest {
    private static int width = 50, height = 20;

    private CreatureFactory testClass;

    @BeforeEach
    void setUp() {
        testClass = new CreatureFactory(width, height);
    }

    @Test
    void generateCreatures() {
        Creature[] creatures = testClass.generateCreatures(5);
        assertEquals(5, creatures.length);
    }

    @Test
    void generateNegativeCreatures() {
        Creature[] creatures = testClass.generateCreatures(-5);
        assertNull(creatures);
    }
}
