package OverloadDemo;

/**
 * Created by Miss_ on 17.10.2015.
 */
public class OverloadDemo {
    public static void main(String [] args ){
        Overload od= new Overload();
        double result;
        int i=55;

        od.test();
        od.test(10);
        od.test(10,15);
        result = od.test(10.2);
        od.test(i); // ����� ������������ od.test(double) �� ���������� ����� � �������� �� ����������
                    // �� ��� ������������������ ������ test(int)
        System.out.println("rezul'tat vjzova od.test(10.2) = " + result);

    }
}
