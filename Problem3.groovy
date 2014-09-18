long x = 600851475143
long i = 2
while( x > 1 ){
    if ( x % i == 0 ){
        x = x / i
        println i
    }else{
        i ++
    }
}