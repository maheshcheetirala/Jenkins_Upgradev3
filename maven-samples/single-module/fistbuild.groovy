job('example') {
    scm {
        github('https://github.com/maheshcheetirala/Jenkins_Upgradev3.git', 'master')
    }
    triggers {
        scmpublish('* * * * *')
    }
    steps {
        maven('clean package','maven-samples/single-module/pom.xml')
    }
    publishers {
        archiveArtifacts '**/*.jar'
    }
