class Solution2{
    public static void main(String[] args) {
        int x=3 ;
        int y=4;
        System.out.println("Before swap:x="+ x + " and y="+y);
        //swap usong xor
        x=x^y;
        x=x^y;
        x=x^y;
        System.out.println("Afyer Swap:x="+ x +" and y=" + y);

        
    }
}