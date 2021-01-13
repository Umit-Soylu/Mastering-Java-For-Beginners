package com.compiled_with_no_errors.exercises.project_phases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProjectPhasesTest {

    @Test
    void proceed() {
        assertEquals(ProjectPhases.initiate, ProjectPhases.getCurrentPhase());

        ProjectPhases.proceed();
        assertEquals(ProjectPhases.planning, ProjectPhases.getCurrentPhase());

        ProjectPhases.proceed();
        assertEquals(ProjectPhases.execution, ProjectPhases.getCurrentPhase());

        ProjectPhases.proceed();
        assertEquals(ProjectPhases.monitoring, ProjectPhases.getCurrentPhase());

        ProjectPhases.proceed();
        assertEquals(ProjectPhases.closure, ProjectPhases.getCurrentPhase());
    }
}