long a=0, b=0, c=0
long s = 1000
long m=0, k=0, n=0, d=0
long limit = Math.sqrt(s/2)
boolean found = false;

for(m = 2; m <= limit; m++){
    if( (s/2)%m == 0 ){
        if( m%2 == 0) { k = m + 1 }
        else { k = m+2 }
    }
    while( k < 2*m && k <= s/(2*m) ){
        if( s/(2*m)%k == 0 && gcd(k,m) == 1 ){
            d = (s/2)/(k*m)
            n = k - m
            a = d*(m * m - n * n);
            b = 2 * d * n * m;
            c = d * (m * m + n * n);
            found = true;
            break; 
        }
        k += 2
    }
    if(found){ break }
}
println "Triplet is: $a $b $c and product is ${a*b*c}"
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