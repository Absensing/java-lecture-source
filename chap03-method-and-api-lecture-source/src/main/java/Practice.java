public class Practice {

    public static void main(String[] args) {


        /* Application01
         * 정수형 변수 2개를 선언하여  각 20과 30으로 초기화 한 후
         * 두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요
         *
         * -- 출력 예시 --
         * 더하기 결과  : 50
         * 빼기 결과 : -10
         * 곱하기 결과 : 600
         * 나누기한 몫 : 0
         * 나누기한 나머지 : 20
         * */

        int inum = 20;
        int onum = 30;

        int plus = inum + onum;
        int minus = inum - onum;
        int gop = inum * onum;
        int mok = inum / onum;
        int namusi = inum % onum;

        System.out.println(" 더하기 결과 = " + plus  );
        System.out.println(" 빼기 결과 = " + minus );
        System.out.println(" 곱하기 결과 = " + gop );
        System.out.println(" 나누기한 몫 = " + mok );
        System.out.println(" 나누기한 나머지 = " + namusi );


        /* Application02
         * 사각형의 넓이와 둘레를 구하는 문제이다.
         * 너비 12.5 높이 36.4를 변수에 저장하고
         * 각 넓이와 둘레를 계산해 변수에 담고 아래와 같이 출력되도록 하시오
         *
         * -- 출력 예시 --
         * 면적 : 455.0
         * 둘레 : 97.8
         *  */

        double nubi = 12.5;
        double height = 36.4;

        double myunjuck = nubi * height;
        double dulrae = (nubi + height) * 2;

        System.out.println("면적 = " + myunjuck );
        System.out.println("둘레 = " + dulrae );




        /* Application01
         * 문자형 변수를 하나 선언 후 'a'를 대입한 후
         * 출력은 문자 'a'가 가지는 유니코드값을 출력하도록 하세요
         *
         * -- 출력 예시 --
         * 문자 a의 unicode : 97
         * */


        char jae = 'a';

        System.out.println("문자" + jae + "의 unicode = " + (int)jae );




        /* Application02
         * 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
         * 총점과 평균을 정수 형태로 출력하세요
         *
         * -- 출력 예시 --
         * 총점 : 201
         * 평균 : 67
         *  */

        double Korean = 80.5;
        double Math = 50.6;
        double English = 70.8;

        int chongjum = (int)(Korean + Math + English);
        int pyunggun = (int)(Korean + Math + English) / 3;

        System.out.println("총점 : " + chongjum);
        System.out.println("평균 : " + pyunggun);


        /* 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
        만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다. (1)에 알맞은 코드를 넣으시오.
        public static void main(String[] args) {
		int num = 456;
		System.out.println( "/*" );*/

        int num = 456;
        int num2 = 111;

        System.out.println("num");



        /* 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의 값이 333이라면 331이 되고, 777이라면 771이 된다.
        (1)에 알맞은 코드를 넣으시오.
        public static void main(String[] args) {
		int num = 333;
		System.out.println( /* (1) */

        System.out.println(" + " + 1);


    }
}
