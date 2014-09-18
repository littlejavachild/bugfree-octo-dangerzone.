class CollatzRunner extends Thread{
    public CollatzRunner(Range r){ range = r }
    def range;
    def length = 0g
    def startsFrom = 0g
    @Override
    public void run(){
        for( each in range ){
            def temp = new BigInteger(each.toString())
            def count = 0g
            while( temp != 1 ){
               count++
               if( temp.longValue() % 2 == 0 ) temp = temp / 2
               else temp = (3*temp) + 1
            }
            if( count > length ){
               length = count
               startsFrom = each
            }
        }
        println "Collatz Sequence of length $length from $startsFrom"
    }
}

CollatzRunner c1 = new CollatzRunner(500000..1)
CollatzRunner c2 = new CollatzRunner(999999..500001)
c1.start()
c2.start()