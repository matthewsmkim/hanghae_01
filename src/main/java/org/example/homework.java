/*

1번 문제

var1, var2 가 int 형이므로 var1/var2 계산시 2가 나오게 되고
var3는 2.0이 됨

따라서, (int)(var3*var2) 는 4

*/


/*

2번 문제

31

 */




// 3번 문제

package org.example;

public class homework {
    public static void main(String[] args) {

        System.out.println("Start!");
        while(true){

            int ran1 = (int)(Math.random()*6)+1;
            int ran2 = (int)(Math.random()*6)+1;

            if(ran1+ran2==5) {
                System.out.println("("+ran1+","+ran2+")");
                break;
            }

            else {
                System.out.println("("+ran1+","+ran2+")");
            }
        }
    }

}
