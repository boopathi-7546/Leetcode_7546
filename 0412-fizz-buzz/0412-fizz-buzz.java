class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=i+1;
            if(num%3==0 && num%5==0){
                arr.add("FizzBuzz");
            }
            else if(num%3==0){
                arr.add("Fizz");
            }
            else if(num%5==0){
                arr.add("Buzz");
            }
            else{
                arr.add(String.valueOf(num));
            }
        }
        return arr;
    }
}