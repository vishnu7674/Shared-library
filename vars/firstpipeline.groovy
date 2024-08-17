// pipeline + groovy
// import the calculator class from package
import com.i27academy.bUilds.calculator

def call(Map pipelineparams){
    // An instance of the class called calculator is created

calculator calculator = new calculator(this)

pipeline {
    agent any
    environment {
        APP_Name = ${pipelineparams.appName} //this value should come from the microservices
    }
    stages {
        stage ('addition') {
            steps {
                echo "priniting sum of 2 numbers"
                println calculator.add(3,4)
                echo "**********microservice name is: ${APP_Name} ******"
            }
        }
    }
}

