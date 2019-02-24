/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin library project to get you started.
 */

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM.
    id("org.jetbrains.kotlin.jvm") version Versions.kotlin
    id("org.jmailen.kotlinter") version Versions.kotlinter
    // id("com.gradle.plugin-publish") version "0.9.10"
    `maven-publish`
    `java-gradle-plugin`
    `build-scan`
}

buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"

    publishAlways()
}

gradlePlugin {
    plugins {
        create("GsqlPlugin") {
            id = "com.optum.gradle.tigergraph"
            implementationClass = "com.optum.gradle.tigergraph.GsqlPlugin"
        }

    }
}

repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

group = "com.optum.gradle.tigergraph"
version = "0.1.0"

publishing {
    repositories {}
    publications {}
}
