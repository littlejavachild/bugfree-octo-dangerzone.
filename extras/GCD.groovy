// MAIN
long[] x = [5,15,30]
println gcd(x)
// Source: http://math.stackexchange.com/questions/80031/smallest-integer-divisible-by-all-up-to-n
// Source: http://stackoverflow.com/questions/4201860/how-to-find-gcf-lcm-on-a-set-of-numbers
/**
* Euclid's method to find GCD
* Assumes that a >= b
*/
long gcd(long a, long b){
    long r = -1;
    long q = -1;
    while( r != 0 ){
        r = a % b
        q = a / b
        a = b
        b = r
    }
    return a
}

long gcd(long[] input){
    long result = input[0]
    for(int i = 1; i < input.length; i++) result = gcd(result, input[i]);
    return result
}