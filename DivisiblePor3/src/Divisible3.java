public class Divisible3 {
    private String number;
    private boolean isDivisble = false;

    public Divisible3(String number) {
        this.number = number;
    }

    public String divide(){
        String num = "";
        String res;
        for (int i = 1; i <= Long.valueOf(number); i++) {
            num += i;
        }
        if(Long.valueOf(num)%3==0){
            res = "SI";
        }else{
            res = "NO";
        }
        return res;
    }
}