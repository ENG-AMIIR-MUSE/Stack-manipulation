import java.util.Stack;

public class Sol {
    Stack<Integer> original =  new Stack<>();
    Stack<Integer> min = new Stack<>();
    Stack<Integer> max  = new Stack<>();
    int freqCounter = 1;
    String freq = "";

     int  push(int e) {
        if (min.empty() || e < min.peek()) {
            min.push(e);
        }
        if(max.empty() || e > max.peek()){
            max.push(e);
        }
        return original.push(e);
    }

    int peek() {
        return original.peek();

    }

    int pop() {
        int removed = original.pop();
        if (removed == min.peek()) {
            min.pop();
        }
        if(removed ==  max.peek()){
            max.pop();
        }
        return removed;
    }
    int getMin(){
        return min.peek();
    }
    int getMax(){
         return max.peek();
    }
    String  getFreq(){

         Stack<Integer> num =  new Stack<>();
         int el ;
         for(int i  = 0 ; i < original.size(); i ++){

             if(num.contains(original.get(i))){
                 freqCounter++;
                 freq += " element   "+ original.get(i) + " is Frequncey "+ freqCounter;
//
             }else{
                 num.push(original.get(i));
             }
             System.out.println(" fre"+num.toString());

         }
         return freq;
    }

    public static void main(String[] args) {

        Sol  s  = new Sol();
        s.push(12);
        s.push(22);

        s.push(4);
        s.push(2);
        s.push(2);
        s.push(2);
        s.push(2);
        s.push(1);
        s.push(32);
        s.push(11);
        s.push(100);
//        System.out.println(s.peek());
//        System.out.println(s.getMin());
//        System.out.println(s.s2.size());
//        System.out.println("removing "+s.pop());
//        System.out.println("removing "+s.pop());
//        System.out.println("removing "+s.pop());

        System.out.println(s.getMin());
        System.out.println(s.getMax());
        System.out.println(s.original.toString());
        System.out.println(s.getFreq());
        System.out.println(s.getMax());
        System.out.println(s.getMin());
    }
}

