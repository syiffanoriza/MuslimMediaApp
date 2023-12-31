// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // TO USE KSP DOWNGRADE ALL OTHER PLUGINS
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
    id("com.android.library") version "8.1.0" apply false
    // TODO 24 - ADD KSP IN TOP-LEVEL BUILD FILE
    id("com.google.devtools.ksp") version "1.8.10-1.0.9" apply false
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}