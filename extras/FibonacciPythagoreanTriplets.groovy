// BIG FLAW : only finds triplets where a = odd
// First 1000 odd numbers
def odds = []
def i = 1
for(e in 1..1000){ odds << i; i += 2 }

def a,b,c
def a2,b2,c2
def n

// Applying Fibonacci's method to generate 
// Pythagorean triplets
i = 1
while( i < odds.size() ){
    if( isPerfectSquare(odds[i]) ){
        k = odds[i]
        a2 = k
        n = (k + 1) / 2
        def sum = 0
        0.upto(n-2){
            sum += odds[it]
        }
        b2 = sum
        c2 = a2 + b2
        a = Math.sqrt(a2).toInteger()
        b = Math.sqrt(b2).toInteger() 
        c = Math.sqrt(c2).toInteger()
        println "Pythagorean Triple is: $a $b $c"
    }
    i++
}

/**
*    Checks if a number is a perfect square
*/
boolean isPerfectSquare(def n){
    def sqrt = Math.sqrt(n)
    if( sqrt == Math.ceil(sqrt) ) { return true }
    else { return false }
}
