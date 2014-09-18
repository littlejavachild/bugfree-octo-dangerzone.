// http://www.robertdickau.com/lattices.html
// 137846528820
@Grab('commons-lang:commons-lang:2.4')
import org.apache.commons.lang.StringUtils;
def pascal = [
                [1],
                [1,1]
             ]
def level = 2
def gridNo = 0
while( gridNo <= 20 ){
    def l = [1]
    def prev = pascal[ level - 1 ]
    def x = 1G
    while( x < prev.size() ){
        def num = 0G
        num += (prev[x] + prev[x-1])
        l << num
        x++
    }
    l << 1
    pascal << l
    if( l.size() % 2 != 0){
        gridNo++
        if(gridNo == 20){
            def list = pascal[pascal.size()-1]
            def idx = (list.size()+1)/2
            println list[idx.intValue()-1]
        }
    }
    level++
}

//def maxSize = java.util.Arrays.toString(pascal[pascal.size()-1]).replace("[","").replace("]","").replace(",","").size();
//for( e in pascal ){
//    def string = java.util.Arrays.toString(e).replace("[","").replace("]","").replace(",","")
//    println StringUtils.center(string,maxSize)
//}
