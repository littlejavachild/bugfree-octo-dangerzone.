def sum = 0
for(each in 0..<1000){
    if(each % 3 == 0 || each % 5 == 0){
        sum += each
    }
}
println sum