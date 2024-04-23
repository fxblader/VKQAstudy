plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("org.seleniumhq.selenium:selenium-java:4.19.1")
    implementation ("org.seleniumhq.selenium:selenium-chrome-driver:4.19.1")
    implementation("org.seleniumhq.selenium:selenium-api:4.19.1")
    implementation ("io.github.bonigarcia:webdrivermanager:5.7.0")
    implementation ("com.codeborne:selenide:7.2.3")
    implementation("org.junit.jupiter:junit-jupiter:5.8.1")
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.8.1")

}

tasks.test {
    useJUnitPlatform()
}