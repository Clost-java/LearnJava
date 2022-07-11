package LearnJava;

public class EarnMoney {
    public static void main(String[] args) {
        System.out.println("甲每天给乙1000元,乙第一题给甲1分钱,第二天2分,第三天4分....30天后谁更有钱");
        double Jmoney = 0,Ymoney = 0;
        for (int i = 0; i < 30; i++) {
            Ymoney += 1000;
            Jmoney +=Math.pow(2,i) * 0.01;
        }
        if(Ymoney > Jmoney){
            System.out.println("乙更有钱!" + Ymoney);
        }else {
            System.out.println("甲更有钱!" + Jmoney );
        }

    }
}
