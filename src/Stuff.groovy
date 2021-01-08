class Stuff {
    int var1 = 101

    public int getVar1(){
        this.var1 = 301
        return var1
    }

    static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if (n%i ==0)
                return false
        }
        return true
    }

    static def fibonacciSequence(int limit){
        int a=0, b=1, c
        for(int i=0; i<limit; i++){
            c=a+b
            print(c+"  ")
            a=b
            b=c
        }
    }

    static void main(String[] args) {

        Stuff groovyStuff = new Stuff()
        println(groovyStuff.getVar1())

        fibonacciSequence(10)
        println(isPrime(97))

        int a = 2
        switch (a) {
            case 1:
                println("The value of a is One");
                break;
            case 2:
                println("The value of a is Two");
                break;
            case 3:
                println("The value of a is Three");
                break;
            case 4:
                println("The value of a is Four");
                break;
            default:
                println("The value is unknown");
                break;
        }
    }
}
