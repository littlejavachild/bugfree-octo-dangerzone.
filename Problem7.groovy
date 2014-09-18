def N = 10001
// The Nth prime number will always be less than this value
def MAX =  Math.floor( N * (Math.log(N) + Math.log(Math.log(N))) )
def count = 1
def i = 2
while( count != N ){
    if( isPrime(i) ){
        count ++
        if( count == N ){
           println "$i is prime"
           break        
        }
    }
    i++
}
/**
*    Checks whether a number is prime
*/
boolean isPrime(def n){
    if( n == 2 ){ return true }
    if( n % 2 == 0 ){ return false }
    for(i in 3..Math.ceil(Math.sqrt(n))){
        if( n%i == 0 ){
            return false
        }
    }
    return true
}