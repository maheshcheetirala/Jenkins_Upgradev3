job('example') {
    description("First Project using DSL")
    jdk('Java 8')
    scm {
        github('https://github.com/maheshcheetirala/Jenkins_Upgradev3.git', 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package','maven-samples/single-module/pom.xml')
    }
    publishers {
        archiveArtifacts '**/*.jar'
    }
