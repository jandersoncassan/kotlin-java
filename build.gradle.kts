plugins {
    kotlin("jvm") version "2.0.0"
}

group = "br.com.jandera"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    runtimeOnly("org.jetbrains.kotlin:kotlin-reflect:2.0.0")

    testImplementation(kotlin("test"))
    testImplementation ("org.junit.jupiter:junit-jupiter:5.8.2")
    testImplementation ("org.amshove.kluent:kluent:1.68")
    implementation(kotlin("reflect"))

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}