apply(from = "../docker-build.gradle")

dependencies {
    implementation(project(":commons:model"))
    implementation(project(":commons:persistence-database"))
    implementation(project(":commons:health-check"))
    implementation(project(":commons:logback-appender"))
}
