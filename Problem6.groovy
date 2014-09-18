def range = 1..100
def sumOfSquare = 0
def squareOfSum = 0
for(e in range){
    squareOfSum += e
    sumOfSquare += e**2
}
squareOfSum = squareOfSum**2
println (squareOfSum - sumOfSquare)