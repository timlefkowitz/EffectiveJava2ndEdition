//Fig. 18.11: TowersOfHanoi.java
// Towers of Hanoi solution with a recursive method.


/*

                                                   ###
                    TowersOfHanoi        . ..   
                                        .  .              ##
                                        .  ..    ....
                                        . , .    .   ,
                                        . . .    .   .
                                     .. .  .. ...   ...   . ..
                                     
            JAVA - HOW TO PROGRAM 10th edition, typed out by me timothy lefkowitz. 
            I retype from books to gain a better understanding of OOP. 
                                    
                                    . . |
                                        |                                
                                     
                                     
                                     
                                     
 */



public class TowersOfHanoi {
    
    
    //recursively move disks between towers
    public static void solveTowers(int i, int disk, int sourcePeg, int destinationPeg, int tempPeg) {
        if (disk == 1) {
            System.out.printf("%n%d--> %d", sourcePeg, destinationPeg);
            return;
        }

        //recursion step -- move (disk - 1) disks from sourcePeg
        //to tempPeg using destinationPeg

        int disks = 0;
        solveTowers(disks - 1, sourcePeg, destinationPeg, sourcePeg, tempPeg);
    }
        
        public static void main(String[] args) {
            int startPeg = 1;
            int endPeg = 3;
            int tempPeg = 0;
            int totalDisks = 3;

            //initial nonrecursive call: move all disks.
            


            solveTowers(totalDisks, startPeg, endPeg, tempPeg);


        }
    
}
