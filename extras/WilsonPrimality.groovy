// Wilson's primality test : http://en.wikipedia.org/wiki/Wilson's_theorem
// Wilson's primality test explained : http://theoremoftheweek.wordpress.com/2010/05/28/theorem-27-wilsons-theorem/

def N = 10001
def MAX =  Math.floor( N * (Math.log(N) + Math.log(Math.log(N))) )
def count = 0

for(n in 2..MAX){
    if( isPrime(n) ){
        ++count
        if( count == N ){
           println n        
        }
    }
}
/**
*    Finds whether a given number is prime or not
*    using Wilson's Theorem
*/
boolean isPrime(def n){
    if( fact(n-1) % n == (n-1) % n  ){ return true }
    else{ return false }
}
/**
*    Calculates the factorial of a given number
*/
BigInteger fact(def n){
     def fact = 1G
     while(n > 0){
         fact *= n--
     }
     return fact
}  