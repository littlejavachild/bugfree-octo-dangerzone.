// MAIN
long[] x = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]
println lcm(x)
/**
* Euclidian method to find GCD
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
/**
* LCM of a single number
*/
long lcm(long a, long b){
    return a * (b / gcd(a,b));
}

/**
* LCM of a set of numbers
*/
long lcm(long[] input)
{
    long result = input[0];
    for(int i = 1; i < input.length; i++) 
        result = lcm(result, input[i]);
    return result;
}