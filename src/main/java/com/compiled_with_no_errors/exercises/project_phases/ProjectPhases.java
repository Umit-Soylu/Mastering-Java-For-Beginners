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
     * This method returns the current phase of the project.
     * @return current phase of the project.
     */
    public static ProjectPhases getCurrentPhase() {
        return currentPhase;
    }

    /**
     * Process the project to the next phase.
     * @implNote if the project is already in {@link ProjectPhases#closure}, will not do anything
     */
    public static void proceed(){
        if (currentPhase.ordinal() < ProjectPhases.values().length - 1)
            currentPhase = ProjectPhases.values()[(currentPhase.ordinal() + 1)];
    }
}
