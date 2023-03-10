buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
        classpath("com.android.tools.build:gradle:7.3.1")
        classpath("com.squareup.sqldelight:gradle-plugin:1.5.4")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.44.2")
    }
}

plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("7.3.1").apply(false)
    id("com.android.library").version("7.3.1").apply(false)
    kotlin("android").version("1.7.20").apply(false)
    kotlin("multiplatform").version("1.7.20").apply(false)
    kotlin("kapt").version("1.7.20").apply(false)
    id("com.squareup.sqldelight").version("1.5.4").apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
