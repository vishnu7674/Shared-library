// pipeline + groovy
// import the calculator class from package
import com.i27academy.bUilds.calculator

// An instance of the class called calculator is created

calculator calculator = new calculator(this)

pipeline {
    agent any
    stages {
        stage ('addition') {
            steps {
                echo "priniting sum of 2 numbers"
                println calculator.add(3,4)
            }
        }
    }
}