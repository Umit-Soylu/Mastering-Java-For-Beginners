package com.compiled_with_no_errors.examples.life_simulation.creatures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatureFactoryTest {
    private CreatureFactory testClass;

    @BeforeEach
    void setUp() {
        testClass = new CreatureFactory(10, 10);
    }

    @Test
    void testCreatureGeneration() {
        Creature creature = testClass.generateCreatures();
        assertNotNull(creature);
    }
}
