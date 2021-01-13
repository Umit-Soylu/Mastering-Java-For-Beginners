package com.compiled_with_no_errors.exercises.project_phases;

/**
 * This method stores information about current project.
 */
public enum ProjectPhases {
    initiate,
    planning,
    execution,
    monitoring,
    closure;

    // Stores the current phase of the project.
    private static ProjectPhases currentPhase = ProjectPhases.initiate;

    /**
     *
     * @return current phase of the project.
     */
    public ProjectPhases getCurrentPhase() {
        return currentPhase;
    }

    /**
     * Process the project to the next phase.
     */
    public void proceed(){

    }
}
