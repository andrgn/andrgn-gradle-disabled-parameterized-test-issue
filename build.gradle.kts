plugins {
    kotlin("jvm") version "1.6.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation(platform("org.junit:junit-bom:5.8.1"))
    implementation("org.junit.jupiter:junit-jupiter")
    implementation("org.junit.jupiter:junit-jupiter-params")
}

tasks.test {
    useJUnitPlatform()

    testLogging {
        events("PASSED", "FAILED", "SKIPPED")
    }
}