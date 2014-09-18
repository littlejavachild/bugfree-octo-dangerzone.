def MAX = 999
def count = MAX
def largest = 0

while(MAX > 1){
    count = 999
    while(count > 1){
        def prod = count * MAX
        if(prod == rev(prod)){ 
            if(prod > largest){ largest = prod }
        }
        count--
    }
    MAX --
}

println largest

long rev(long x){
    long d = 0
    long rev = 0
    while( x > 0 ){
         d = x % 10
         x = x / 10
         rev = rev * 10 + d
    }
    return rev
}