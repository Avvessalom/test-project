import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    id("org.sonarqube") version "3.3"

}

group = "me.user"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

sonarqube {
    properties {
        property ("sonar.projectKey", "Avvessalom_test-project")
        property ("sonar.organization", "avvessalom")
        property ("sonar.host.url", "https://sonarcloud.io")
    }
}

dependencies {
    testImplementation(kotlin("test-junit"))
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.6.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")
}


tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}