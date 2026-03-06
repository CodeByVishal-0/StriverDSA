package Recursion;

import java.util.ArrayList;
import java.util.List;

class k_th_Permutation_Sequence{
    public static void main(String[] args){
        int n=3;
        int k=6;
        String ans="";
        List<Integer> numbers= new ArrayList<>();
        int fact=1;
        for(int i=1;i<n;i++){
            fact=fact*i;
            numbers.add(i);
        }
        numbers.add(n);
        k=k-1;
        while(true){
            ans=ans+numbers.get(k/fact);
            numbers.remove(k/fact);
            if(numbers.size()==0){
                break;
            }
            k=k%fact;
            fact=fact/numbers.size();
        }
        System.out.println(ans);
    }
}