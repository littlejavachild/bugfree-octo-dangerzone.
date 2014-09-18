def MAX = 4000000
def i = 0
def j = 1
def fib = i + j
def sum = 0
while( fib < MAX ){
    if( fib % 2 == 0 ){
        sum += fib
    }
    i = j
    j = fib
    fib = i + j
}
println sum